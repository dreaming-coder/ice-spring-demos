package com.ice;

import com.ice.config.TXConfig;
import com.ice.entity.User;
import com.ice.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        context = new AnnotationConfigApplicationContext(TXConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.addUser(new User("10000000006", "易", 24));
        userService.showUsers();
    }
}
