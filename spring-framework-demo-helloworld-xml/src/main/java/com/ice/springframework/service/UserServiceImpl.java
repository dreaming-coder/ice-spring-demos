package com.ice.springframework.service;

import com.ice.springframework.dao.UserDaoImpl;
import com.ice.springframework.entity.User;

import java.util.List;

public class UserServiceImpl {
    private UserDaoImpl userDao;

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public List<User> findUserList() {
        return this.userDao.findUserList();
    }


}
