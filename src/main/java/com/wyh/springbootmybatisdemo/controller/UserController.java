package com.wyh.springbootmybatisdemo.controller;


import com.wyh.springbootmybatisdemo.mapper.UserMapper;
import com.wyh.springbootmybatisdemo.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserMapper userMapper;

    @GetMapping
    public User findUser(@RequestParam(value = "id") Long id){

        return userMapper.findById(id);
    }

    @GetMapping("/login")
    public String jdsf(@RequestParam(value = "userName") String userName,@RequestParam(value = "passwd") String pw){
        return "用户名不存在m或密码l不正确";
    }

    @PostMapping(value = "login",produces= MediaType.APPLICATION_JSON_VALUE)
    public String fds(@RequestBody  User user){
        return "登录成功";

    }


}
