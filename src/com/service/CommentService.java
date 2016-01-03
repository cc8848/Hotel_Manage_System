package com.service;

import com.model.Comment;

/**
 * Created by stiles on 16/1/2.
 */
public interface CommentService {
    boolean add(Comment comment);
    boolean remove(String id);
}
