package com.dao;

import com.model.Hotel;

/**
 * Created by stiles on 15/12/27.
 */
public interface HotelDAO {
    boolean save(Hotel hotel);
    boolean update(Hotel hotel);
    Hotel findOne(String id);
    Hotel findOnd(String name, String password);
    boolean delete(String id);
}
