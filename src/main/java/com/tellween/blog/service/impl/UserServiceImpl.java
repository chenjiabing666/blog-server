package com.tellween.blog.service.impl;
import com.tellween.blog.dao.UserMapper;
import com.tellween.blog.domain.User;
import org.springframework.stereotype.Service;
import com.tellween.blog.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Integer userId) {
        return userMapper.getUser(userId);

    }

    @Resource
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
        System.out.println(user);
        System.out.println(10/0);
    }


}
