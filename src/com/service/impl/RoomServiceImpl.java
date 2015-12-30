package com.service.impl;

import com.dao.RoomDAO;
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
}
