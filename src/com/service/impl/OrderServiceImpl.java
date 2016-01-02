package com.service.impl;

import com.dao.OrderDAO;
import com.model.Hotel;
import com.model.Order;
import com.model.User;
import com.service.OrderService;

import java.util.List;

/**
 * Created by stiles on 15/12/30.
 */
public class OrderServiceImpl implements OrderService {
    OrderDAO orderDAO;

    public void setOrderDAO(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    public OrderServiceImpl() {
        System.out.println("OrderServiceImpl is created.");
    }

    @Override
    public boolean update(Order order) {
        return orderDAO.update(order);
    }

    @Override
    public boolean add(Order order) {
        return orderDAO.save(order);
    }

    @Override
    public boolean remove(String id) {
        return orderDAO.delete(id);
    }

    @Override
    public Order findOneById(String id) {
        return orderDAO.findById(id);
    }

    @Override
    public boolean ifConflict(Order order) {
        return orderDAO.ifConflict(order);
    }

    @Override
    public List findByUser(User user, int pageNow, int pageSize) {
        return orderDAO.findByUser(user, pageNow, pageSize);
    }

    @Override
    public int findSizeByUser(User user) {
        return orderDAO.findSizeByUser(user);
    }

    @Override
    public List findByHotel(Hotel hotel, int pageNow, int pageSize) {
        return orderDAO.findByHotel(hotel, pageNow, pageSize);
    }

    @Override
    public int findSizeByHotel(Hotel hotel) {
        return orderDAO.findSizeByHotel(hotel);
    }
}
