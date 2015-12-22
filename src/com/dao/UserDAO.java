package com.dao;

import com.model.User;

/**
 * Created by stiles on 15/12/16.
 */
public interface UserDAO {
    boolean save(User user);    //储存用户
    boolean update(User user);  //更改用户
    User findOne(String ID);    //查找用户
    boolean delete(String ID);  //删除用户

}
