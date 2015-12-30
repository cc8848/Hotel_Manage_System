package com.service;

import com.model.Order;

/**
 * Created by stiles on 15/12/30.
 */
public interface OrderService {
    boolean add(Order order);
    boolean remove(String id);
    boolean update(Order order);
    Order findOneById(String id);
    boolean ifConflict(Order order);
}
