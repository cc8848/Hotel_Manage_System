package com.action.user;

import com.model.Order;
import com.model.Room;
import com.model.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.service.UserService;

import java.sql.Date;
import java.util.Map;

/**
 * Created by stiles on 15/12/30.
 */
public class ReserveRoomAction extends ActionSupport {
    OrderService orderService;
    UserService userService;
    Order order;
    String phone;
    Date start;
    Date end;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        order = new Order();
        order.setStart(start.getTime());
        order.setEnd(end.getTime());
        User user = (User)session.get("user");
        Room room = (Room)session.get("room");
        if (user == null) {
            user = userService.findOne(phone);
            if (user == null) {
                user = new User();
                user.setPhone(phone);
                userService.register(user);
                System.out.println(user);
                user = userService.findOne(phone);
            } else {
                addFieldError("start", "此手机号已经被注册请登录");
                return INPUT;
            }
        }
        order.setPrice(room.getPricePerNight());
        order.setUser(user);
        order.setRoom(room);
        if (!orderService.ifConflict(order)) {
            if (orderService.add(order)) {
                session.put("order", order);
                return SUCCESS;
            }
            else {
                addFieldError("start", "后台储存错误");
                return INPUT;
            }
        } else {
            addFieldError("start", "此时间段此房间已经被预定");
            return INPUT;
        }
    }

    @Override
    public void validate() {
        if (end.before(start) || start.before(new java.util.Date()))
            addFieldError("start", "日期输入错误");
    }
}
