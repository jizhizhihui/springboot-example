package com.JZhi.project.controller;

import com.JZhi.common.result.ResponseEntity;
import com.JZhi.common.result.ServiceException;
import com.JZhi.project.entity.ServerParamVo;
import com.JZhi.socket.dto.ServerSendDto;
import com.JZhi.socket.enums.FunctionCodeEnum;
import com.JZhi.socket.server.Connection;
import com.JZhi.socket.server.SocketServer;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentMap;

/**
 * @author 丁许
 * @date 2019-01-25 8:54
 */
@RestController
@RequestMapping("/socket-server")
public class SocketServerController {

	@Resource
	private SocketServer socketServer;

	@GetMapping("/get-users")
	public ResponseEntity<JSONObject> getLoginUsers() {
		ConcurrentMap<String, Connection> userMaps = socketServer.getExistSocketMap();
		JSONObject result=new JSONObject();
		result.put("total",userMaps.keySet().size());
		result.put("dataList",userMaps.keySet());
		return ResponseEntity.success(result);
	}

	@PostMapping("/send-message")
	public ResponseEntity<?> sendMessage(@RequestBody ServerParamVo paramVo) {

		if (StringUtils.isEmpty(paramVo.getUserId()) || StringUtils.isEmpty(paramVo.getMessage())) {
			throw new ServiceException("参数不全");
		}
		if (!socketServer.getExistSocketMap().containsKey(paramVo.getUserId())) {
			throw new ServiceException("并没有客户端连接");
		}
		Connection connection = socketServer.getExistSocketMap().get(paramVo.getUserId());
		ServerSendDto dto = new ServerSendDto();
		dto.setFunctionCode(FunctionCodeEnum.MESSAGE.getValue());
		dto.setStatusCode(20000);
		dto.setMessage(paramVo.getMessage());
		connection.println(JSONObject.toJSONString(dto));
		return ResponseEntity.success();
	}
}
