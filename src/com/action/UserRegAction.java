package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserRegService;

import java.util.Date;

/**
 * Created by stiles on 15/12/19.
 */
public class UserRegAction extends ActionSupport {
    private User user;
    private UserRegService userRegService;

    public void setUserRegService(UserRegService userRegService) {
        this.userRegService = userRegService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String register() {
        if (userRegService.register(user))
            return "success";
        return "error";
    }
    public void validate() {
        User tUser = userRegService.findOne(user.getPhone());
        if (tUser != null) {
            if (tUser.getRegister())
                addFieldError("user.phone", "该手机号已经被注册");
        }
    }
}
