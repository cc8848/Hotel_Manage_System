package com.action;

import com.model.User;
import com.service.UserRegService;

import java.util.Date;

/**
 * Created by stiles on 15/12/19.
 */
public class UserRegAction {
    private User user;
    private UserRegService userRegService;
    private String password;
    private String phone;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserRegService(UserRegService userRegService) {
        this.userRegService = userRegService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String regView(){
        return "success";
    }

    public String register() {
        //System.out.println(user.getPhone());
        //System.out.println(user.getPassword());
        //user.setRegister(true);
        if (userRegService.register(user))
            return "success";
        return "error";
    }
}
