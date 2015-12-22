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

    public void setUserRegService(UserRegService userRegService) {
        this.userRegService = userRegService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String regView(){
        return "success";
    }

    public String register() {
        if (userRegService.register(user))
            return "success";
        return "error";
    }
}
