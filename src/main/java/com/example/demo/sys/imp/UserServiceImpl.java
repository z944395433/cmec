package com.example.demo.sys.imp;

import com.example.demo.sys.dao.UserDao;
import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

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
        UserVo user = dao.findUser(map.get("username").toString());
        if (user == null) {
            throw new Exception("账号不存在");
        }
        UserVo users = dao.login(map);
        if (users == null) {
            throw new Exception("账号不存在");
        }
        return users;
    }
}
