package com.JZhi.project.controller;


import com.JZhi.project.entity.Role;
import com.JZhi.project.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *  权限控制器
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    public RoleController(IRoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("getList")
    public List<Role> getList(){
        return roleService.list();
    }

    @GetMapping("getById")
    public Role getById(int id){
        return roleService.getById(id);
    }
}
