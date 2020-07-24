package com.JZhi.project.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author com.JZhi
 * @since 2020-06-25
 */
@Controller
@RequestMapping("/userInfo")
public class UserController {

    /**
     * 用户查询
     *
     * @return
     */
    @RequestMapping("/userList")
    @RequiresPermissions("user:view")
    public String userInfo() {
        return "userInfo";
    }

    /**
     * 用户添加
     *
     * @return
     */
    @RequestMapping("/userAdd")
    @RequiresPermissions("user:add")
    public String userInfoAdd() {
        return "userInfoAdd";
    }

    /**
     * 用户删除
     *
     * @return
     */
    @RequestMapping("/userDel")
    @RequiresPermissions("user:del")
    public String userDel() {
        return "userInfoDel";
    }
}
