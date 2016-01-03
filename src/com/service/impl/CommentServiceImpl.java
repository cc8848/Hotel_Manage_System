package com.service.impl;

import com.dao.CommentDAO;
import com.model.Comment;
import com.service.CommentService;

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
}
