package com.service;

import com.model.Admin;

/**
 * Created by stiles on 15/12/28.
 */
public interface AdminService {
    Admin find(String username);
}
