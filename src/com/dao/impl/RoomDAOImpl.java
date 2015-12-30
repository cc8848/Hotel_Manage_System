package com.dao.impl;

import com.dao.BaseDAO;
import com.dao.RoomDAO;
import com.model.Room;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by stiles on 15/12/28.
 *
 */
public class RoomDAOImpl extends BaseDAO implements RoomDAO {
    @Override
    public boolean save(Room room) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.save(room);
            ts.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Room room) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            session.update(room);
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
            Query query = session.createQuery("delete from Room where id='" + id + "'");
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
    public Room find(String id) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Room where id='" + id +"'");
            query.setMaxResults(1);
            Room room = (Room) query.uniqueResult();
            ts.commit();
            session.clear();
            session.close();
            return room;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int findRoomsSize() {
        try {
            Session session = getSession();
            //Transaction ts = session.beginTransaction();

            String hql = "from Room as r where r.empty=true";
            Query query = session.createQuery(hql);

            return query.list().size();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List findAll(int pageNow, int pageSize) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            boolean flag = true;
            Query query = session.createQuery("from Room as r where r.empty=true order by id");
            int firstResult = (pageNow-1)*pageSize;
            query.setFirstResult(firstResult);
            query.setMaxResults(pageSize);
            List list = query.list();
            ts.commit();
            session.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
