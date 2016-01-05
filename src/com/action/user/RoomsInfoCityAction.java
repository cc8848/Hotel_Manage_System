package com.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;
import com.tool.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 16/1/6.
 */
public class RoomsInfoCityAction extends ActionSupport {
    RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

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

    @Override
    public String execute() throws Exception {
        List list = roomService.findRoomsByCity(city ,pageNow, pageSize);
        Map request = (Map) ActionContext.getContext().get("request");
        Pager page = new Pager(getPageNow(), roomService.findRoomsSize());
        request.put("list", list);
        request.put("page", page);
        return SUCCESS;
    }
}
