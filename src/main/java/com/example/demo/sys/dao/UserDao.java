package com.example.demo.sys.dao;

import com.example.demo.sys.vo.UserVo;

public interface UserDao {
    UserVo findUser( String username);
}
