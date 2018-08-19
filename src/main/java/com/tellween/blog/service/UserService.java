package com.tellween.blog.service;

import com.tellween.blog.domain.User;

public interface UserService {
    void addUser(User user);
    User getUser(Integer userId);
}
