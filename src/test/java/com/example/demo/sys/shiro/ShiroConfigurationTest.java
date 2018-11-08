package com.example.demo.sys.shiro;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.sys.vo.UserVo;
import net.sf.json.JSONArray;
import org.junit.Test;

import java.util.Map;

public class ShiroConfigurationTest {

    @Test
    public void hh(){
        String str = "{'sname':'yys','age':'16'}";
        UserVo user = new UserVo();
        user.setUserName("123");
        user.setPassword("***");
        JSONObject tsr = (JSONObject) JSON.toJSON(user);
        Map map =tsr;

        /*System.out.println(tsr);
        net.sf.json.JSONObject j = net.sf.json.JSONObject.fromObject(str);
        System.out.println(j);*/


    }
}