package com.action.hotel;

import com.model.Hotel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.HotelService;

import java.util.Map;

/**
 * Created by stiles on 15/12/27.
 */
public class HotelRegisterAction extends ActionSupport {
    Hotel hotel;
    HotelService hotelService;

    public void setHotelService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String register() {
        Map session = ActionContext.getContext().getSession();
        if (hotelService.add(hotel)) {
            session.put("hotel", hotel);
            return "success";
        }
        addFieldError("hotel.name", "注册失败");
        return "input";
    }

    public void validate() {
        Hotel tHotel = hotelService.findOne(hotel.getHotelName(), hotel.getPassword());
        if (tHotel != null) {
            addFieldError("hotel.name", "已经注册");
        }
    }
}
