package com.bjsxt.service.impl;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;

    @Override
    public void addUsers() {
        this.usersDao.insertUsers();
    }
}
