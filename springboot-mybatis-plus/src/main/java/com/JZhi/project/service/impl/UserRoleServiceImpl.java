package com.JZhi.project.service.impl;

import com.JZhi.project.entity.Role;
import com.JZhi.project.entity.UserRole;
import com.JZhi.project.entity.VO.UserRoleVO;
import com.JZhi.project.mapper.RoleMapper;
import com.JZhi.project.mapper.UserRoleMapper;
import com.JZhi.project.service.IUserRoleService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

    @Resource
    RoleMapper RoleMapper;

    public List<Role> getUserRoleList(int userId){
        List<Role> roles = new ArrayList<>();
        getBaseMapper().selectList(Wrappers.<UserRole>lambdaQuery().eq(UserRole::getUserId,userId)).forEach(s ->
            roles.add(RoleMapper.selectById(s.getRoleId()))
        );
        return roles;
    }

    public UserRoleVO getUserRoleVO(int userId){
        return getBaseMapper().findUserRoleVO(userId);
    }
}
