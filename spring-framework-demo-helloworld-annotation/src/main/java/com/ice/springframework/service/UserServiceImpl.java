package com.ice.springframework.service;

import com.ice.springframework.dao.UserDaoImpl;
import com.ice.springframework.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl {
    private UserDaoImpl userDao;

    @Autowired
    public void setUserDao( UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    public List<User> findUserList() {
        return this.userDao.findUserList();
    }
}
