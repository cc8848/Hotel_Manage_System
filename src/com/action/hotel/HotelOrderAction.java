package com.action.hotel;

import com.model.Order;
import com.opensymphony.xwork2.ActionContext;
import com.service.OrderService;

import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class HotelOrderAction {
    OrderService orderService;
    String order_id;
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String accept() {
        Map session = ActionContext.getContext().getSession();
        try {
            Order order = orderService.findOneById(order_id);
            order.setIfValid(false);
            orderService.update(order);
            session.put("message", "操作成功!");
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            session.put("message", "数据库存期发生错误,请稍后...");
            return "error";
        }
    }

    public String remove() {
        Map session = ActionContext.getContext().getSession();
        try {
            orderService.remove(order_id);
            session.put("message", "操作成功!");
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            session.put("message", "数据库存期发生错误,请稍后...");
            return "error";
        }
    }
}
