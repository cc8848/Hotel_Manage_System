package com.action.hotel;
import com.model.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class HotelRoomDetailsAction extends ActionSupport {
    RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    String room_id;

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Room room = (Room)roomService.findOne(room_id);
        session.put("room", room);
        return SUCCESS;
    }
}
