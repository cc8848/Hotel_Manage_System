package com.action.hotel;

import com.model.Hotel;
import com.model.Order;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.OrderService;
import com.tool.Pager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class HotelOrdersInfoAction extends ActionSupport {
    OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }


    private int pageNow = 1;
    private int pageSize = 20;

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

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Hotel hotel = (Hotel)session.get("hotel");
        if (hotel == null) {
            session.put("message", "未登录,请先登陆");
            return ERROR;
        }
        List<Order> list = orderService.findByHotel(hotel, pageNow, pageSize);
        Map request = (Map) ActionContext.getContext().get("request");
        Pager page = new Pager(getPageNow(), orderService.findSizeByHotel(hotel));
        DateFormat format = new SimpleDateFormat("yyyy年MM月dd日");
        for (Order order: list) {
            order.setEndTime(format.format(order.getEnd()));
            order.setStartTime(format.format(order.getStart()));
        }

        request.put("list", list);
        request.put("page", page);
        return SUCCESS;
    }
}
