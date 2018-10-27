package com.example.demo.sys.shiro;

import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class MyShiroRealm extends AuthorizingRealm {

    @Autowired
    IUserService iUserService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return (AuthorizationInfo) principalCollection;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = String.valueOf(token.getPassword());
        Map<String, Object> map = new HashMap<>();
        map.put("username",username);
        map.put("password",password);
        UserVo user = null;
        try {
           user = iUserService.login(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),"123");
    }
}