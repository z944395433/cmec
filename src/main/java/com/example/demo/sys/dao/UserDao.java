package com.example.demo.sys.dao;

import com.example.demo.sys.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao {
    UserVo findUser(String username, String password);
}
