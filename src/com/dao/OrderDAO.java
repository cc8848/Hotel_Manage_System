package com.dao;

import com.model.Order;

/**
 * Created by stiles on 15/12/30.
 */
public interface OrderDAO {
    boolean save(Order order);
    boolean delete(String id);
    boolean update(Order order);
    Order findById(String id);
    boolean ifConflict(Order order);
}
