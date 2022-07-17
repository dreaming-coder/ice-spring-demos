package com.ice.controller;

import com.ice.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RequestController {
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable Integer id, @PathVariable("username") String name, @PathVariable Map<String, String> kv) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("kv", kv);
        return map;
    }

    @GetMapping("/car")
    public Map<String, Object> getCar(@RequestHeader("User-Agent") String userAgent, // 可以获取指定请求头的内容
                                      @RequestHeader Map<String, String> header) { //  也可以直接用一个 Map<String,String>接收所有请求头的键值对
        Map<String, Object> map = new HashMap<>();
        map.put("userAgent", userAgent);
        map.put("header", header);
        return map;
    }

    @GetMapping("/info")
    public Map<String, Object> getCar(@RequestParam("age") Integer age, @RequestParam("sex") String sex,
                                      @RequestParam("inters") List<String> inters,
                                      @RequestParam Map<String, String> params) {
        Map<String, Object> map = new HashMap<>();
        map.put("age", age);
        map.put("sex", sex);
        map.put("inters", inters);
        map.put("params", params);
        return map;
    }

    @GetMapping("/cookie")
    public Map<String, Object> getCar(@CookieValue("_ga") String _ga,
                                      @CookieValue("_ga") Cookie cookie) {
        Map<String, Object> map = new HashMap<>();
        map.put("_ga", _ga);
        map.put("cookie", cookie);
        return map;
    }

    @PostMapping("/save")
    public Map<String, Object> postMethod(@RequestBody String content) {
        Map<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") String low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path) {
        Map<String, Object> map = new HashMap<>();
        map.put("low", low);
        map.put("brand", brand);
        map.put("path", path);
        return map;
    }

    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age", pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age", pathVar = "empId") Integer empAge) {
        Map<String, Object> map = new HashMap<>();
        map.put("bossAge", bossAge);
        map.put("empAge", empAge);

        return map;
    }

    @GetMapping("/addUser")
    public User addUser(User user) {
        System.out.println(user);
        return user;
    }
}
