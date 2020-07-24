package com.JZhi.project.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
* 
* </p>
*
* @author com.JZhi
* @since 2020-06-25
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
    * 角色名
    */
    private String name;

    /**
    * 是否可用 1可用 0禁用
    */
    private Integer available;

    /**
    * 是否删除 1删除 0显示
    */
    private Integer delete;

}