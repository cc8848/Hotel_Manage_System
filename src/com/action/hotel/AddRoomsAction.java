package com.action.hotel;

import com.model.Hotel;
import com.model.Room;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

import java.util.Map;

/**
 * Created by stiles on 15/12/28.
 */
public class AddRoomsAction extends ActionSupport {
    private RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int No;

    public int getNo() {
        return No;
    }

    public void setNo(int no) {
        No = no;
    }

    public String addRooms() {
        Map session = ActionContext.getContext().getSession();
        Hotel hotel = (Hotel)session.get("hotel");
        room.setHotel(hotel);
        room.setNo(String.valueOf(No));
        roomService.add(room);
        return SUCCESS;
    }
}
