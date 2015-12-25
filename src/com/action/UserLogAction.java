package com.action;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

import java.util.Map;

/**
 * Created by stiles on 15/12/25.
 */
public class UserLogAction extends ActionSupport {
    private String phone;
    private String password;

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login(){
        Map session = ActionContext.getContext().getSession();
        User user = userService.login(phone, password);
        if (user == null) {
            addFieldError("password", "用户名或密码错误");
        } else {
            session.put("user", user);
        }
        if (hasErrors())
            return "input";
        return "success";
    }
}
