package com.JZhi.project.service.impl;

import com.JZhi.project.entity.User;
import com.JZhi.project.mapper.UserMapper;
import com.JZhi.project.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
