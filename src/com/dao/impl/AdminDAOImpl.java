package com.dao.impl;

import com.dao.AdminDAO;
import com.dao.BaseDAO;
import com.model.Admin;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by stiles on 15/12/28.
 */
public class AdminDAOImpl extends BaseDAO implements AdminDAO {
    @Override
    public Admin find(String username) {
        try {
            Session session = getSession();
            Transaction ts = session.beginTransaction();
            Query query = session.createQuery("from Admin where username='" + username +"'");
            query.setMaxResults(1);
            Admin admin = (Admin) query.uniqueResult();
            ts.commit();
            session.clear();
            session.close();
            return admin;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
