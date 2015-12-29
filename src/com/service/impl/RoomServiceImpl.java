package com.service.impl;

import com.dao.RoomDAO;
import com.model.Room;
import com.service.RoomService;

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
        if(roomDAO.save(room))
            return true;
        return false;
    }
}
