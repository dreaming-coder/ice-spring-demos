package com.ice.controller;

import com.ice.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public User addUser(User user) {
        return user;
    }

    @GetMapping(value = "/user2/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public User addUser2(@PathVariable int id) {
        return new User(id,"亚索",18);
    }
}
