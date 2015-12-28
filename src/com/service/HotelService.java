package com.service;

import com.model.Hotel;

/**
 * Created by stiles on 15/12/27.
 */
public interface HotelService {
    boolean add(Hotel hotel);
    boolean remove(String id);
    Hotel findOne(String id);
    Hotel findOne(String name, String password);
}
