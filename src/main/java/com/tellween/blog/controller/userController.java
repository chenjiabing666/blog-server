package com.tellween.blog.controller;

import com.tellween.blog.dao.UserMapper;
import com.tellween.blog.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class userController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/user/get")
    public User get(){
        return userMapper.getUser(1);

    }

}
