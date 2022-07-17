package com.ice.exception;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class CustomHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        ModelAndView mv=new ModelAndView();
        if (e instanceof NullPointerException){
            mv.setViewName("4xx");
        }
        if(e instanceof  ArithmeticException){
            mv.setViewName("5xx");
        }
        mv.addObject("error",e.toString());
        return mv;
    }
}
