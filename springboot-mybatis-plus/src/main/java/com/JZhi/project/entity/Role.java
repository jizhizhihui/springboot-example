package com.JZhi.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author com.JZhi
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_role")
@ApiModel(value="Role对象", description="权限表")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "角色名")
    private String name;

    @ApiModelProperty(value = "是否可用 1可用 0禁用")
    private Integer available;

    @ApiModelProperty(value = "是否删除 1删除 0显示")
    private Integer delStatus;

}
