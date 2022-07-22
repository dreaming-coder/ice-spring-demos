package com.ice.service;

import com.ice.dao.UserDao;
import com.ice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void showUsers(){
        userDao.selectAll().forEach(System.out::println);
    }

    @Transactional
    public void addUser(User user){
        userDao.addUser(user);
    }
}
