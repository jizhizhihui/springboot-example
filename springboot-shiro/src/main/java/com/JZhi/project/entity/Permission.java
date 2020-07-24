package com.JZhi.project.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author com.JZhi
 * @since 2020-06-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_permission")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限类型 菜单menu 或单条权限permission
     */
    private String type;

    /**
     * 权限URL
     */
    private String url;

    /**
     * 权限代码
     */
    private String percode;

    /**
     * 父级ID
     */
    private Integer parentid;

    /**
     * 是否可用 1可用 0禁用
     */
    private Integer available;

    /**
     * 是否删除 1删除 0显示
     */
    private Integer delete;

    /**
     * 权限表ID
     */
    private int roleId;
}