package com.example.demo.sys.serviceImp;

import com.example.demo.sys.vo.UserVo;

import java.util.Map;

public interface IUserService {
    UserVo findUser(UserVo user);

    UserVo login(Map<String, Object> map) throws Exception;
}
