package com.service.impl;

import com.dao.AdminDAO;
import com.model.Admin;
import com.service.AdminService;

/**
 * Created by stiles on 15/12/28.
 */
public class AdminServiceImpl implements AdminService {
    AdminDAO adminDAO;

    public void setAdminDAO(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    @Override
    public Admin find(String username) {
        return adminDAO.find(username);
    }
}
