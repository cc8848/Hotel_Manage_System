package com.service.impl;

import com.dao.HotelDAO;
import com.model.Hotel;
import com.service.HotelService;

/**
 * Created by stiles on 15/12/27.
 */
public class HotelServiceImpl implements HotelService {
    HotelDAO hotelDAO;
    HotelServiceImpl(){
        System.out.println("HotelServiceImpl is created.");
    }

    public void setHotelDAO(HotelDAO hotelDAO) {
        this.hotelDAO = hotelDAO;
    }

    @Override
    public boolean add(Hotel hotel) {
        if (hotelDAO.findOnd(hotel.getHotelName(), hotel.getPassword()) == null) {
            return hotelDAO.save(hotel);
        }
        return false;
    }

    @Override
    public Hotel findOne(String id) {
        return hotelDAO.findOne(id);
    }

    @Override
    public Hotel findOne(String name, String password) {
        return hotelDAO.findOnd(name, password);
    }

    @Override
    public boolean remove(String id) {
        return hotelDAO.delete(id);
    }
}
