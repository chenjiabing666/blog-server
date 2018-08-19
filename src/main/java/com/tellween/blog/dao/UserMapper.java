package com.tellween.blog.dao;

import com.tellween.blog.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
//    @Select("select * from t_user where user_id=#{userId}")
    User getUser(Integer userId);
}
