package com.service;

import com.model.Comment;
import com.model.Hotel;
import com.model.User;

import java.util.List;

/**
 * Created by stiles on 16/1/2.
 */
public interface CommentService {
    boolean add(Comment comment);
    boolean remove(String id);
    List findByUser(User user);
    List findByHotel(Hotel hotel);
    List findAll(int pageNow, int pageSize);
    int findSize();
}
