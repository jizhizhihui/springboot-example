package com.JZhi.project.controller;


import com.JZhi.project.entity.User;
import com.JZhi.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *  用户控制器
 *
 * @author com.JZhi
 * @since 2020-06-30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 获取所有用户信息
     * @return List<User>
     */
    @GetMapping("/getList")
    public List<User> getList(){
        return userService.list();
    }

    /**
     * 通过 用户ID 查询用户信息
     * @param id 用户ID
     * @return User
     */
    @GetMapping("/getById")
    public User getById(int id){
        return userService.getById(id);
    }

    /**
     * 通过 用户ID 更新用户信息
     * @param user 用户
     * @return String
     */
    @PutMapping("/update")
    public String update(User user){
        return (userService.updateById(user))?"OK":"Fail";
    }

    /**
     * 通过 用户ID 删除用户信息
     * @param id 用户ID
     * @return String
     */
    @DeleteMapping("/delete")
    public String delete(int id){
        return (userService.removeById(id))?"OK":"Fail";
    }

    /**
     * 添加用户
     * @param user 用户
     * @return String
     */
    @PostMapping("/add")
    public String delete(User user){
        return (userService.save(user))?"OK":"Fail";
    }
}
