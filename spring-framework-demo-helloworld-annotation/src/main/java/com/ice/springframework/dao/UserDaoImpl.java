package com.ice.springframework.dao;

import com.ice.springframework.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl {
    public UserDaoImpl() {
    }

    public List<User> findUserList() {
        return Collections.singletonList(new User("ice", 16));
    }
}
