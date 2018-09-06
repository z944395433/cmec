package com.example.demo.sys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class login {

    @RequestMapping("/login.php")
    public String login () {
        System.out.println("hello world");
        return "hello world";

    }
}
