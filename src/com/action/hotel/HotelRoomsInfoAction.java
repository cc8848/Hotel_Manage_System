package com.action.hotel;

import com.model.Hotel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.RoomService;

import java.util.List;
import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class HotelRoomsInfoAction extends ActionSupport {
    RoomService roomService;

    public void setRoomService(RoomService roomService) {
        this.roomService = roomService;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Hotel hotel = (Hotel)session.get("hotel");
        if (hotel == null) {
            session.put("error", "未登录,请先登录");
            return ERROR;
        }
        List list = roomService.findRoomsByHotel(hotel);
        session.put("list", list);
        return SUCCESS;
    }
}
