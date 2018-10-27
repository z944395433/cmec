package com.example.demo.sys.dao;

import com.example.demo.sys.vo.UserVo;

import java.util.Map;

public interface UserDao {
    UserVo findUser( String username);

    UserVo login(Map<String, Object> map);
}
