package com.JZhi.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

/**
 * swagger 测试
 *
 * @author JZhi
 * @description 访问 http://127.0.0.1:8087/swagger-ui.html#/ 查看swagger-UI
 */
@RestController
@RequestMapping("sw")
@Api(tags = "swagger 测试接口")
public class SwaggerController {

    @GetMapping("get")
    @ApiOperation("get测试")
    public String get(){
        return "success";
    }

    @PostMapping("post")
    @ApiOperation("post测试")
    public String post(int x,int y){
        return x + y + "";
    }

    @PutMapping("update")
    @ApiOperation("update测试")
    public String update(User user){
        return "update success";
    }

    @DeleteMapping("delete")
    @ApiOperation("delete测试")
    public String delete(@NotBlank @RequestParam String userId){
        return "delete success";
    }
}
