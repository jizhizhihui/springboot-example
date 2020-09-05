package com.JZhi.project.controller;

import com.JZhi.aop.OperLog;
import com.JZhi.aop.OperationType;
import org.springframework.web.bind.annotation.*;

/**
 * 订单控制器（测试）
 *
 * @author JZhi
 * @since 2020-09-01
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("get")
    @OperLog(operationModul = "订单管理-主键查询", operationType = OperationType.GET, operationDesc = "通过主键查询")
    public String getById(@RequestParam(value = "id") String id){
        return "select success";
    }

    @GetMapping("list")
    @OperLog(operationModul = "订单管理-查询列表", operationType = OperationType.GET, operationDesc = "查询列表")
    public String getList(){
        return "select list success";
    }

    @DeleteMapping("delete")
    @OperLog(operationModul = "订单管理-删除", operationType = OperationType.DEL, operationDesc = "通过主键删除")
    public String deleteById(String id){
        return "delete success";
    }

    @PostMapping("add")
    @OperLog(operationModul = "订单管理-添加", operationType = OperationType.ADD, operationDesc = "添加订单信息")
    public String addOrderInfo(String order){
        return "add success";
    }

    @PutMapping("update")
    @OperLog(operationModul = "订单管理-更新", operationType = OperationType.PUT, operationDesc = "更新订单信息")
    public String updateOrderInfo(String order){
        return "update success";
    }
}
