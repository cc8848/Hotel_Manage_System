package com.dao.impl;

import com.dao.BaseDAO;
import com.dao.UserDAO;
import com.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by stiles on 15/12/16.
 */
public class UserDAOImpl extends BaseDAO implements UserDAO {
    @Override
    public boolean delete(String ID) {  //接口方法实现:删除某用户
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("delete from User where phone='" + ID + "'");
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
    public boolean save(User user) {    //借口方法实现:储存用户
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.save(user);
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(User user) {  //接口方法实现:更改用户
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.update(user);
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User findOne(String ID) {    //接口方法实现:查找用户
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from User where phone='" + ID +"'");
            query.setMaxResults(1);
            User user = (User)query.uniqueResult();
            ts.commit();
            session.clear();
            session.close();
            return  user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
