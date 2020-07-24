package com.JZhi.project.service.impl;

import com.JZhi.project.entity.Permission;
import com.JZhi.project.entity.User;
import com.JZhi.project.mapper.*;
import com.JZhi.project.service.IPermissionService;
import com.JZhi.project.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 用户实现类
 *
 * @author com.JZhi
 * @since 2020-06-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    PermissionMapper permissionMapper;
    @Resource
    RoleMapper roleMapper;

    @Override
    public String getRoleByRoleId(int roleId){
        return roleMapper.selectById(roleId).getName();
    }

    @Override
    public User getByUsername(String username){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getUsername, username);

        return getBaseMapper().selectOne(queryWrapper);
    }

    @Override
    public List<String> getPermissionByRoleId(int roleId){
        List<String> list = new ArrayList<>();

        QueryWrapper<Permission> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Permission::getRoleId, roleId);

        for(Permission p : permissionMapper.selectList(queryWrapper))
            list.add(p.getPercode());
        return list;
    }
}
