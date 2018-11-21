package com.example.result.controller;

import com.example.result.Result.ResponseResult;
import com.example.result.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.util.Password;

/**
 * Created by SunArmy on 2018/11/20.
 */
@RestController
@Api(value="用户controller",tags={"用户操作接口"})
public class UserController {


    @PostMapping("/login")
    @ApiOperation(value = "登录", notes = "账号密码必输")
    public ResponseResult login(String username,String password){
        if ("admin".equals(username) || "123456".equals(password)){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            user.setCity("中国");
            user.setSex("男");
            return new ResponseResult().setData(user);
        }else {
            return new ResponseResult("000000");
        }
    }

    @GetMapping(value = "/findByUsername",produces = { "application/xml;charset=UTF-8" })
    public ResponseResult findByUsername(String username){
        if ("admin".equals(username)){
            User user = new User();
            user.setUsername(username);
            user.setCity("中国");
            user.setSex("女");
            return new ResponseResult().setData(user);
        }else {
            return new ResponseResult("000000");
        }
    }
}
