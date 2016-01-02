package com.service;

import com.model.Order;
import com.model.User;

import java.util.List;

/**
 * Created by stiles on 15/12/30.
 */
public interface OrderService {
    boolean add(Order order);
    boolean remove(String id);
    boolean update(Order order);
    Order findOneById(String id);
    boolean ifConflict(Order order);
    List findByUser(User user, int pageNow, int pageSize);
    int findSizeByUser(User user);
}
