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
        System.out.println("");
        System.out.println("s,lls");

        System.out.println("woshishuiffff");

        System.out.println("xiugai");

        return userMapper.findById(id);
    }

    @GetMapping("/login")
    public String jdsf(@RequestParam(value = "userName") String userName,@RequestParam(value = "passwd") String pw){
        return "用户名sa不存sadasf在或密码不正确";
    }

    @PostMapping(value = "login",produces= MediaType.APPLICATION_JSON_VALUE)
    public String fds(@RequestBody  User user){
        return "登录成功";
    }


}
