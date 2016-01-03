package com.dao.impl;

import com.dao.BaseDAO;
import com.dao.CommentDAO;
import com.model.Comment;
import com.model.Hotel;
import com.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by stiles on 16/1/2.
 */
public class CommentDAOImpl extends BaseDAO implements CommentDAO {
    @Override
    public boolean delete(String id) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("delete from Comment where id='" + id + "'");
            query.executeUpdate();
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean save(Comment comment) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.save(comment);
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List findByUser(User user) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Comment as c where c.user=?");
            query.setParameter(0, user);
            List list = query.list();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List findByHotel(Hotel hotel) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Comment as c where c.hotel=?");
            query.setParameter(0, hotel);
            List list = query.list();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List findAll(int pageNow, int pageSize) {
        Session session = getSession();
        try {
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Comment order by id desc ");
            int firstResult = (pageNow-1)*pageSize;
            query.setFirstResult(firstResult);
            query.setMaxResults(pageSize);
            List list = query.list();
            ts.commit();
            session.close();
            return list;
        } catch (Exception e) {
            session.close();
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int findSize() {
        try {
            Session session = getSession();
            //Transaction ts = session.beginTransaction();

            String hql = "from Comment";
            Query query = session.createQuery(hql);

            return query.list().size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
