package com.action.manage;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by stiles on 15/12/25.
 */
public class ManagerLogAction extends ActionSupport {
    String username;
    String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        Map session = ActionContext.getContext().getSession();
        if (!"admin".equals(username) || !"admin".equals(password)) {
            addFieldError("password", "密码错误");
        }
        if(hasFieldErrors())
            return "input";
        session.put("admin", "admin");
        return "success";
    }
}
