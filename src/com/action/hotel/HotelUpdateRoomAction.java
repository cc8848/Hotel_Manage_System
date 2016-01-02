package com.action.hotel;

import com.model.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class HotelUpdateRoomAction extends ActionSupport {
    RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    private boolean empty;
    private double price;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Room room = (Room)session.get("room");
        room.setPricePerNight(price);
        room.setEmpty(empty);
        roomService.update(room);
        session.put("message", "修改房间信息成功");
        return SUCCESS;
    }
}
