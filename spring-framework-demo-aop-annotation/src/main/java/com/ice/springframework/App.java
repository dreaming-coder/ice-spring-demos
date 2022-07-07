package com.ice.springframework;

import com.ice.springframework.service.CglibProxyServiceImpl;
import com.ice.springframework.service.JDKProxyService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // create and configure beans
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ice.springframework");

        // jdk proxy demo
        JDKProxyService service1 = context.getBean(JDKProxyService.class);
        service1.doMethod1();
        service1.doMethod2();
        try {
            service1.doMethod3();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        // cglib proxy demo
        CglibProxyServiceImpl service2 = context.getBean(CglibProxyServiceImpl.class);
        service2.doMethod1();
        service2.doMethod2();
        try {
            service2.doMethod3();
        } catch (Exception e) {
            // e.printS
        }
    }
}