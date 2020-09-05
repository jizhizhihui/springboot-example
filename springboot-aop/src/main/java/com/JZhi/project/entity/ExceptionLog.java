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
 * 异常信息类
 *
 * @author JZhi
 * @since 2020-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_exception_log")
@ApiModel(value="ExceptionLog对象", description="")
public class ExceptionLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "异常日志表ID")
    @TableId(value = "exc_id", type = IdType.AUTO)
    private Integer excId;

    @ApiModelProperty(value = "请求参数")
    private String reqParam;

    @ApiModelProperty(value = "请求名称")
    private String name;

    @ApiModelProperty(value = "异常信息")
    private String message;

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

    @ApiModelProperty(value = "操作版本")
    private String ver;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime createTime;


}
