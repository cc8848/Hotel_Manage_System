package com.dao;

import com.model.Comment;
import com.model.Hotel;
import com.model.User;

import java.util.List;

/**
 * Created by stiles on 16/1/2.
 */
public interface CommentDAO {
    boolean save(Comment comment);
    boolean delete(String id);
    List findByUser(User user);
    List findByHotel(Hotel hotel);
    List findAll(int pageNow, int pageSize);
    int findSize();
}
