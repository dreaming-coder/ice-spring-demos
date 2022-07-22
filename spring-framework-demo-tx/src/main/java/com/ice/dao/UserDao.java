package com.ice.dao;


import com.ice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> selectAll() {
        List<User> users = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        return users;
    }

    public void addUser(User user) {
        String sql = "insert into user values(?,?,?)";
        Object[] args = {user.getId(), user.getName(), user.getAge()};
        jdbcTemplate.update(sql, args);
        // int a = 1/0;
    }
}

