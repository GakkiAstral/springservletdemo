package com.bjsxt.dao.impl;

import com.bjsxt.dao.UsersDao;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl implements UsersDao {
    @Override
    public void insertUsers() {
        System.out.println("insert into users...");
    }
}
