package com.JZhi.project.mapper;

import com.JZhi.project.entity.UserRole;
import com.JZhi.project.entity.VO.UserRoleVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    @Select("SELECT * FROM `tb_user_role` WHERE user_id = #{userId}")
    @Results({
            @Result(property = "roles", column = "role_id",
                    many = @Many(select = "com.com.JZhi.project.mapper.RoleMapper.selectById"))
    })
    UserRoleVO findUserRoleVO(int userId);
}
