package com.example.demo.sys.controller;

import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class login {

    @Autowired
    @Qualifier("userService")
    private IUserService iuser;

    @RequestMapping("/login.php")
    public String login (UserVo user) {
        user.setUserName("123");
        user.setPassword("123");
        iuser.findUser(user);

        System.out.println("hello world");
        return "hello world";
    }
}
