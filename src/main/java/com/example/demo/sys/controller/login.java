package com.example.demo.sys.controller;

import com.example.demo.sys.imp.UserServiceImpl;
import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/sys")
public class login {

    @Autowired
    private UserServiceImpl iUserService;


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
//        iuser.findUser(user);

        System.out.println("hello world");
        return "hello world";
    }


    @RequestMapping(value = "/hello.php",method = RequestMethod.POST)
    public UserVo test(String username,String password) throws Exception {
        //Object username = map.get("username");
        System.out.println(username);
        UserVo user = new UserVo();
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userName","123");
        map.put("password","123");
        return iUserService.login(map);
    }

    @RequestMapping(value = "/data.php")
    public String data(){
        return "<div style=\"background-color: red;width:50px;height: 50px\">我是后台返的div</div>";
    }

}
