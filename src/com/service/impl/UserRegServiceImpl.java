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
        if (user.getNickname() == null) {//如果昵称没有填,那么昵称就设置为手机号
            user.setNickname(user.getPhone());
        }
        user.setRegister(true);
        if (userDAO.findOne(user.getPhone()) != null) {//如果用户存在但是没有注册,那么更新信息
            if (userDAO.update(user))
                return true;
        }
        else if(userDAO.save(user)) {
            return true;
        }
        return false;
    }

    @Override
    public User findOne(String phone) {
        return userDAO.findOne(phone);
    }
}
