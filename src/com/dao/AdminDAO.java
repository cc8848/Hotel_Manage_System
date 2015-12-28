package com.dao;

import com.model.Admin;

/**
 * Created by stiles on 15/12/28.
 */
public interface AdminDAO {
    Admin find(String username);
}
