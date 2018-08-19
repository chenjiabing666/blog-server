package com.tellween.blog.controller;

import com.tellween.blog.dao.UserMapper;
import com.tellween.blog.domain.User;
import com.tellween.blog.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class userController {
    @Resource
    private UserService userService;

    @RequestMapping("/user/addUser")
    public User addUser(User user){
        userService.addUser(user);
        return user;
    }

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id")Integer userId){
        return userService.getUser(userId);

    }


}
