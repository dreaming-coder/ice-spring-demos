package com.ice.springframework;

import com.ice.springframework.config.BeansConfig;
import com.ice.springframework.entity.User;
import com.ice.springframework.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
        // retrieve configured instance
        UserServiceImpl service = applicationContext.getBean("userService", UserServiceImpl.class);
        // use configured instance
        List<User> userList = service.findUserList();
        // print info from beans
        userList.forEach(a -> System.out.println(a.getName() + "," + a.getAge()));
    }
}
