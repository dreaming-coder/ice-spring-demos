package com.ice.controller;

import com.ice.exception.XException;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AspectController {

    // 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("ControllerAdvice下InitBinder注解的方法...");
    }

    // 把值绑定到Model中，使全局@RequestMapping可以获取到该值
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "ice");
        System.out.println("ControllerAdvice下ModelAttribute注解的方法...");
    }

    // 全局异常捕捉处理
//    @ResponseBody
//    @ExceptionHandler(value = Exception.class)
//    public Map<String, Object> errorHandler(Exception ex) {
//        Map<String, Object> map = new HashMap<>();
//        map.put("code", 500);
//        map.put("msg", ex.getMessage());
//        System.out.println("ControllerAdvice下ExceptionHandler注解的方法...");
//        return map;
//    }

    // 指定异常处理
    @ResponseBody
    @ExceptionHandler(value = XException.class)
    public void errorHandler2(Exception ex) {
        System.out.println(ex.getMessage());
    }
}
