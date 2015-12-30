package com.action.user;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;
import com.tool.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 15/12/29.
 */
public class RoomsInfoAction extends ActionSupport {
    RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
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

    public String execute() throws Exception {
        List list = roomService.findAll(pageNow, pageSize);
        Map request = (Map) ActionContext.getContext().get("request");
        Pager page = new Pager(getPageNow(), roomService.findRoomsSize());
        request.put("list", list);
        request.put("page", page);
        return SUCCESS;
    }
}
