package com.example.demo.sys.imp;

import com.example.demo.sys.dao.UserDao;
import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao dao;


    @Override
    public UserVo findUser(UserVo user) {
        System.out.println(dao.findUser(user.getUserName()).toString());
        return null;
    }

    @Override
    public UserVo login(Map<String, Object> map) throws Exception {
        UserVo user = dao.findUser(map.get("userName").toString());
        if (user == null) {
            throw new Exception("账号不存在");
        }
        //UserVo users = dao.login(map);
//        if (users == null) {
//            throw new Exception("账号不存在");
//        }
        return user;
    }

    /**
     * jdk1.8学习
     * @param args
     */
    public static void main(String[] args){

        List list = new ArrayList<String>();
        list.add("123");
        list.add("321");
//        list.stream().forEach(it->System.out.println(it.toString()));
       List<String> aa= (List<String>) list.stream().filter(it->it.equals("123")).collect(Collectors.toList());
       System.out.println(aa);
       list.stream().map(it->it.equals("123")).collect(Collectors.toList());

    }
}
