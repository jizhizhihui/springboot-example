package com.JZhi.config;

import com.JZhi.project.entity.User;
import com.JZhi.project.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    private IUserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("权限配置-->MyShiroRealm.doGetAuthorizationInfo()");

        //添加角色和权限
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        User user = (User) principals.getPrimaryPrincipal();
        authorizationInfo.addRole(userService.getRoleByRoleId(user.getRoleId()));
        authorizationInfo.addStringPermissions(userService.getPermissionByRoleId(user.getRoleId()));

//        //添加角色和权限
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        for (Role role : admin.getRoles()) {
//            //添加角色
//            simpleAuthorizationInfo.addRole(role.getName());
//            for (Permission permission : role.getPermissions()) {
//                //添加权限
//                simpleAuthorizationInfo.addStringPermission(permission.getName());
//            }
//        }
        return authorizationInfo;
    }

    /**
     * 身份认证(验证账号，密码）
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        System.out.println("MyShiroRealm.doGetAuthenticationInfo()");

        //获取用户的输入的账号.
        String username = (String) token.getPrincipal();

        //通过username从数据库中查找 User对象，如果找到，没找到.
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        User user = userService.getByUsername(username);
        System.out.println("----->>user=" + user);

        if (user == null) { return null; }

        //salt=username+salt
        ByteSource salt = ByteSource.Util.bytes(user.getCredentialsSalt());

        return new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                salt,
                getName()  //realm name
        );
    }

}