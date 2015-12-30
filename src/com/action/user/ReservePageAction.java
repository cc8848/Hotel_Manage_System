package com.action.user;

import com.model.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

import java.util.Map;

/**
 * Created by stiles on 15/12/30.
 */
public class ReservePageAction extends ActionSupport {
    private String room_id;
    private RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    @Override
    public String execute() throws Exception {
        Map request = (Map) ActionContext.getContext().getSession();
        Room room = roomService.findOne(room_id);
        if (room != null) {
            request.put("room", room);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
}
