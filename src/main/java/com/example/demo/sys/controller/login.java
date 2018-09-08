package com.example.demo.sys.controller;

import com.example.demo.sys.imp.UserServiceImpl;
import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/sys")
public class login {

    @Autowired
    private UserServiceImpl iuser;

    @RequestMapping("/login.php")
    public String login (@RequestBody Map<String, Object> map) {
        UserVo user = new UserVo();

        user.setUserName(map.get("username").toString());
        user.setPassword(map.get("password").toString());
       /* Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());*/
        /*try{
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(token);
        }
        catch(Exception e){
            return "login failed";
        }

        return "login success";
    }*/
        iuser.findUser(user);

        System.out.println("hello world");
        return "hello world";
    }
}
