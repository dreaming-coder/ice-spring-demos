package com.ice.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/user")
    public void getUser() {
        System.out.println("GET - 方法");
    }

    @PostMapping("/user")
    public void postUser() {
        System.out.println("POST - 方法");
    }

    @DeleteMapping("/user")
    public void deleteUser() {
        System.out.println("DELETE - 方法");
    }

    @PutMapping("/user")
    public void putUser() {
        System.out.println("PUT - 方法");
    }

    @PatchMapping("/user")
    public void patchUser() {
        System.out.println("PATCH - 方法");
    }

}
