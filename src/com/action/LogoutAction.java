package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by stiles on 15/12/31.
 */
public class LogoutAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        session.remove("user");
        session.remove("room");
        session.remove("hotel");
        session.remove("admin");
        return SUCCESS;
    }
}
