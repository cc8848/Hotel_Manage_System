package com.action.user;

import com.model.Hotel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.CommentService;
import com.service.HotelService;

import java.util.Map;

/**
 * Created by stiles on 16/1/2.
 */
public class UserCommentPageAction extends ActionSupport {
    HotelService hotelService;

    public void setHotelService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    String hotel_id;

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Override
    public String execute() throws Exception {
        Map session = ActionContext.getContext().getSession();
        Hotel hotel = hotelService.findOne(hotel_id);
        session.put("hotel", hotel);
        return SUCCESS;
    }
}
