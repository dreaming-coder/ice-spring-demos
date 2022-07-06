package com.ice.springframework.dao;

import com.ice.springframework.entity.User;

import java.util.Collections;
import java.util.List;

public class UserDaoImpl {
    public UserDaoImpl() {
    }

    public List<User> findUserList() {
        return Collections.singletonList(new User("ice", 16));
    }
}
