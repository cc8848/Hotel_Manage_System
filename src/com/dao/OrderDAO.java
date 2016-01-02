package com.dao;

import com.model.Order;
import com.model.User;

import java.util.List;

/**
 * Created by stiles on 15/12/30.
 */
public interface OrderDAO {
    boolean save(Order order);
    boolean delete(String id);
    boolean update(Order order);
    Order findById(String id);
    boolean ifConflict(Order order);
    List findByUser(User user, int pageNow, int pageSize);
    int findSizeByUser(User user);
}
