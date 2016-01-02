package com.action.user;

import com.dao.OrderDAO;
import com.model.Order;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class OrderDetailsAction extends ActionSupport {
    OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    String order_id;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    @Override
    public String execute() throws Exception {
        Map session = (Map) ActionContext.getContext().getSession();
        Order order = orderService.findOneById(order_id);
        if (order != null) {
            DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
            Date start = new Date(order.getStart());
            Date end = new Date(order.getEnd());
            session.put("start", format.format(start));
            session.put("end", format.format(end));
            session.put("order", order);
            return SUCCESS;
        }
        session.put("error", "查看详情发生错误,订单未找到");

        return ERROR;
    }
}
