package com.service.impl;

import com.dao.CommentDAO;
import com.model.Comment;
import com.model.Hotel;
import com.model.User;
import com.service.CommentService;

import java.util.List;

/**
 * Created by stiles on 16/1/2.
 */
public class CommentServiceImpl implements CommentService {
    CommentDAO commentDAO;

    public void setCommentDAO(CommentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    @Override
    public boolean add(Comment comment) {
        return commentDAO.save(comment);
    }

    @Override
    public boolean remove(String id) {
        return commentDAO.delete(id);
    }

    @Override
    public List findByUser(User user) {
        return commentDAO.findByUser(user);
    }

    @Override
    public List findByHotel(Hotel hotel) {
        return commentDAO.findByHotel(hotel);
    }

    @Override
    public int findSize() {
        return commentDAO.findSize();
    }

    @Override
    public List findAll(int pageNow, int pageSize) {
        return commentDAO.findAll(pageNow, pageSize);
    }
}
