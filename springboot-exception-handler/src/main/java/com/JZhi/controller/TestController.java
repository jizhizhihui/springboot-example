package com.JZhi.controller;

import com.JZhi.common.result.CommonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @RequestMapping("+")
    public CommonResult add(int a,int b){
        return CommonResult.success(a+b);
    }

    @RequestMapping("-")
    public CommonResult subtract(int a,int b){
        return CommonResult.success(a-b);
    }

    @RequestMapping("*")
    public CommonResult multiply (int a,int b){
        return CommonResult.success(a*b);
    }

    @RequestMapping("/")
    public CommonResult divide(int a,int b){
        return CommonResult.success(a/b);
    }

}
