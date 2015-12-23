package com.service;

import com.model.User;

/**
 * Created by stiles on 15/12/19.
 */
public interface UserRegService {
    boolean register(User user);//注册接口
    User findOne(String phone);//根据手机号查找用户
}
