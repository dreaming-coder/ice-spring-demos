package com.ice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {
    //空指针异常
    @RequestMapping("/custom1")
    public String pageJump() {
        String str = null;
        str.length();
        return "ok";
    }

    //算术异常
    @RequestMapping("/custom2")
    public String pageJump1() {
        int i = 3 / 0;
        return "ok";
    }
}
