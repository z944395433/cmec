package com.example.demo.sys.imp;

import com.example.demo.sys.dao.UserDao;
import com.example.demo.sys.serviceImp.IUserService;
import com.example.demo.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao dao;

    @Override
    public UserVo findUser(UserVo user) {
        dao.findUser(user.getUserName(), user.getUserName());
        return null;
    }
}
