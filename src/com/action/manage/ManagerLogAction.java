package com.action.manage;

import com.model.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;

import java.util.Map;

/**
 * Created by stiles on 15/12/25.
 */
public class ManagerLogAction extends ActionSupport {
    AdminService adminService;

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

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
        Admin admin = adminService.find(username);
        if(admin == null){
            addFieldError("password", "密码错误");
            return "input";
        }
        if (!admin.getUsername().equals(username) || !admin.getPassword().equals(password)) {
            addFieldError("password", "密码错误");
            return "input";
        }

        session.put("admin", admin);
        return "success";
    }
}
