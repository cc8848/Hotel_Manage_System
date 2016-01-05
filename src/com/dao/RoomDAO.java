package com.dao;

import com.model.Hotel;
import com.model.Room;

import java.util.List;

/**
 * Created by stiles on 15/12/28.
 */
public interface RoomDAO {
    boolean save(Room room);
    boolean delete(String id);
    boolean update(Room room);
    Room find(String id);
    List findAll(int pageNow, int pageSize);
    int findRoomsSize();
    List findRoomsByHotel(Hotel hotel);
    List findRoomsByCity(String city, int pageNow, int pageSize);
}
