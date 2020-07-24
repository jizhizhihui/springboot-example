package com.JZhi.project.entity.VO;

import com.JZhi.project.entity.Role;
import com.JZhi.project.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value="UserRoleVO", description="展示用户权限")
public class UserRoleVO implements Serializable {

    @ApiModelProperty(value = "用户")
    private List<User> users;

    @ApiModelProperty(value = "权限")
    private List<Role> roles;
}
