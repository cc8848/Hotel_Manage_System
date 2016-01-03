package com.dao;

import com.model.Comment;

/**
 * Created by stiles on 16/1/2.
 */
public interface CommentDAO {
    boolean save(Comment comment);
    boolean delete(String id);
}
