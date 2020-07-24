package com.JZhi.project.entity;

    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;
    import org.apache.shiro.crypto.SecureRandomNumberGenerator;

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
@TableName("tb_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 用户表ID
    */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 加盐
    */
    private String salt;

    /**
    * 权限表ID
    */
    private int roleId;

    /**
     * 密码盐.
     * @return
     */
    public String getCredentialsSalt(){
        return this.username+this.salt;
    }

    /**
     * 生成随机盐
     */
    public void randomSalt() {
        // 一个Byte占两个字节，此处生成的3字节，字符串长度为6
        SecureRandomNumberGenerator secureRandom = new SecureRandomNumberGenerator();
        String hex = secureRandom.nextBytes(3).toHex();
        setSalt(hex);
    }
}