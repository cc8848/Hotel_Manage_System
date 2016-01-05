package com.service.impl;

import com.dao.RoomDAO;
import com.model.Hotel;
import com.model.Room;
import com.service.RoomService;

import java.util.List;

/**
 * Created by stiles on 15/12/28.
 */
public class RoomServiceImpl implements RoomService {
    RoomServiceImpl(){
        System.out.println("RoomServiceImpl is created.");
    }

    RoomDAO roomDAO;

    public void setRoomDAO(RoomDAO roomDAO) {
        this.roomDAO = roomDAO;
    }

    @Override
    public boolean add(Room room) {
        return roomDAO.save(room);
    }

    @Override
    public int findRoomsSize() {
        return roomDAO.findRoomsSize();
    }

    @Override
    public List findAll(int pageNow, int pageSize) {
        return roomDAO.findAll(pageNow, pageSize);
    }

    @Override
    public Room findOne(String id) {
        return roomDAO.find(id);
    }

    @Override
    public List findRoomsByHotel(Hotel hotel) {
        return roomDAO.findRoomsByHotel(hotel);
    }

    @Override
    public boolean remove(String id) {
        return roomDAO.delete(id);
    }

    @Override
    public boolean update(Room room) {
        return roomDAO.update(room);
    }

    @Override
    public List findRoomsByCity(String city, int pageNow, int pageSize) {
        return roomDAO.findRoomsByCity(city, pageNow, pageSize);
    }
}
