package com.JZhi.project.service;

import com.JZhi.project.entity.Permission;
import com.JZhi.project.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * 用户服务类
 *
 * @author com.JZhi
 * @since 2020-06-25
 */
public interface IUserService extends IService<User> {
    String getRoleByRoleId(int roleId);
    User getByUsername(String username);
    List<String> getPermissionByRoleId(int roleId);
}
