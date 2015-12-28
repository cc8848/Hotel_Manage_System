package com.action.hotel;

import com.model.Hotel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.HotelService;

import java.util.Map;

/**
 * Created by stiles on 15/12/28.
 */
public class HotelLoginAction extends ActionSupport {
    private String name;
    private String password;
    private HotelService hotelService;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHotelService(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    public String login(){
        Map session = ActionContext.getContext().getSession();
        Hotel hotel = hotelService.findOne(name, password);
        if (hotel == null) {
            addFieldError("password", "名字或者密码错误");
            return "input";
        } else {
            session.put("hotel", hotel);
            return "success";
        }
    }

}
