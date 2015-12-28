package com.dao.impl;

import com.dao.BaseDAO;
import com.dao.HotelDAO;
import com.model.Hotel;
import com.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by stiles on 15/12/27.
 */
public class HotelDaoImpl extends BaseDAO implements HotelDAO {
    @Override
    public boolean update(Hotel hotel) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.update(hotel);
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean save(Hotel hotel) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.save(hotel);
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(String id) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("delete from Hotel where id='" + id + "'");
            query.executeUpdate();
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Hotel findOnd(String name, String password) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Hotel where hotelName='" + name +"'" + "and password='" + password + "'");
            query.setMaxResults(1);
            Hotel hotel = (Hotel)query.uniqueResult();
            ts.commit();
            session.clear();
            session.close();
            return hotel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Hotel findOne(String id) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Hotel where id='" + id +"'");
            query.setMaxResults(1);
            Hotel hotel = (Hotel) query.uniqueResult();
            ts.commit();
            session.clear();
            session.close();
            return hotel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
