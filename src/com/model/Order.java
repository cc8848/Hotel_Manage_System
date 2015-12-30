package com.model;

import java.util.Date;

/**
 * Created by stiles on 15/12/28.
 */
public class Order {
    private String id;
    private Room room;
    private User user;

    long start;
    long end;

    boolean ifValid;

    public Order() {
        this.ifValid = true;
    }

    public boolean isIfValid() {
        return ifValid;
    }

    public void setIfValid(boolean ifValid) {
        this.ifValid = ifValid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
