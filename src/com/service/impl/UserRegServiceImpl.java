package com.service.impl;

import com.dao.UserDAO;
import com.model.User;
import com.service.UserRegService;

/**
 * Created by stiles on 15/12/19.
 */
public class UserRegServiceImpl implements UserRegService {
    private UserDAO userDAO;
    UserRegServiceImpl(){
        System.out.println("UserRegServiceImpl is created.");
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean register(User user) {    //注册接口实现
        user.setRegister(true);
        if(userDAO.save(user)) {
            return true;
        }
        return false;
    }
}
