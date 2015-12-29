package com.model;

import java.util.Date;

/**
 * Created by stiles on 15/12/28.
 */
public class Order {
    private String id;
    private Room room;
    private User user;

    Date start;
    Date end;

    boolean ifValid;

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
