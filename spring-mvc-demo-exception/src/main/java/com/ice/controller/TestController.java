package com.ice.controller;

import com.ice.exception.XException;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/home1")
    public String home(ModelMap modelMap) {
        System.out.println("/home1：" + modelMap.get("author"));
        return modelMap.get("author").toString();
    }

    //通过@ModelAttribute获取
    @GetMapping("/home2")
    public String home(@ModelAttribute("author") String author) {
        System.out.println("/home2：" + author);
        return author;
    }

    @GetMapping("/home3")
    public String home() {
        int a = 1 / 0;
        return "failed";
    }

    @GetMapping("/home4")
    public String exception(@RequestParam int n) {
        if (n >10){
            throw new XException("抛出人为异常");
        }
        return "success";
    }
}
