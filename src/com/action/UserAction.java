package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

import java.util.Map;

/**
 * Created by stiles on 15/12/19.
 */
public class UserAction extends ActionSupport {
    private User user;
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String register() {
        System.out.println(user);
        Map session = ActionContext.getContext().getSession();
        if (userService.register(user)) {
            session.put("user", user);
            return "success";
        }
        return "error";
    }
    public void validate() {
        User tUser = userService.findOne(user.getPhone());
        if (tUser != null) {
            if (tUser.getRegister())
                addFieldError("user.phone", "该手机号已经被注册");
        }
    }
}
