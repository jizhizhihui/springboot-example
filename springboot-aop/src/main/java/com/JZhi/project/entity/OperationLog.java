package com.JZhi.project.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 操作信息类
 *
 * @author JZhi
 * @since 2020-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_operation_log")
@ApiModel(value="OperationLog对象", description="")
public class OperationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "操作表ID")
    @TableId(value = "oper_id", type = IdType.AUTO)
    private Integer operId;

    @ApiModelProperty(value = "功能模块")
    private String model;

    @ApiModelProperty(value = "操作类型")
    private String type;

    @ApiModelProperty(value = "操作描述")
    private String operDesc;

    @ApiModelProperty(value = "请求参数")
    private String reqParam;

    @ApiModelProperty(value = "返回参数")
    private String resParam;

    @ApiModelProperty(value = "操作员ID")
    private String userId;

    @ApiModelProperty(value = "操作员名称")
    private String username;

    @ApiModelProperty(value = "操作方法")
    private String method;

    @ApiModelProperty(value = "请求URL")
    private String url;

    @ApiModelProperty(value = "请求IP")
    private String ip;

    @ApiModelProperty(value = "请求时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "操作版本")
    private String ver;
}
