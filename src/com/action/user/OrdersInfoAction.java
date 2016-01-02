package com.action.user;

import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.tool.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 15/12/31.
 */
public class OrdersInfoAction extends ActionSupport {
    OrderService orderService;

    private int pageNow = 1;
    private int pageSize = 10;

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public String execute() throws Exception {
        Map session = (Map) ActionContext.getContext().getSession();
        User user = (User)session.get("user");
        if (user == null) {
            session.put("error", "未登陆,请先登陆!");
            return ERROR;
        }
        List list = orderService.findByUser(user, pageNow, pageSize);
        Map request = (Map) ActionContext.getContext().get("request");
        Pager page = new Pager(getPageNow(), orderService.findSizeByUser(user));
        request.put("list", list);
        request.put("page", page);
        return SUCCESS;
    }
}
