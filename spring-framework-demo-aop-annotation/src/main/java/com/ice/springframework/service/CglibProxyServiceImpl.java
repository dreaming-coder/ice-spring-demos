package com.ice.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class CglibProxyServiceImpl {
    public void doMethod1() {
        System.out.println("CglibProxyServiceImpl.doMethod1()");
    }

    public String doMethod2() {
        System.out.println("CglibProxyServiceImpl.doMethod2()");
        return "hello world";
    }

    public String doMethod3() throws Exception {
        System.out.println("CglibProxyServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
