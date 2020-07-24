package com.JZhi.project.controller;


import com.JZhi.project.entity.Role;
import com.JZhi.project.entity.VO.UserRoleVO;
import com.JZhi.project.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 *  用户权限控制器
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {

    @Autowired
    private IUserRoleService userRoleService;

    @GetMapping("/getUserRoleList")
    public List<Role> getUserRoleList(@NotBlank int userId){
        return userRoleService.getUserRoleList(userId);
    }

    @GetMapping("/getUserRoleVo")
    public UserRoleVO getUserRoleVo(@NotBlank int userId){
        return userRoleService.getUserRoleVO(userId);
    }
}
