package com.JZhi.project.service;

import com.JZhi.project.entity.Role;
import com.JZhi.project.entity.UserRole;
import com.JZhi.project.entity.VO.UserRoleVO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
public interface IUserRoleService extends IService<UserRole> {
    List<Role> getUserRoleList(int userId);

    UserRoleVO getUserRoleVO(int userId);
}
