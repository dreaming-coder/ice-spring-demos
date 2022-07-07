package com.ice.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class JDKProxyServiceImpl implements JDKProxyService{
    @Override
    public void doMethod1() {
        System.out.println("JDKProxyServiceImpl.doMethod1()");
    }

    @Override
    public String doMethod2() {
        System.out.println("JDKProxyServiceImpl.doMethod2()");
        return "hello world";
    }

    @Override
    public String doMethod3() throws Exception {
        System.out.println("JDKProxyServiceImpl.doMethod3()");
        throw new Exception("some exception");
    }
}
