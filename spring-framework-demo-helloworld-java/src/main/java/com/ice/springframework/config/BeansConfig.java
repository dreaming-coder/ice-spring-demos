package com.ice.springframework.config;

import com.ice.springframework.aspect.LogAspect;
import com.ice.springframework.dao.UserDaoImpl;
import com.ice.springframework.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class BeansConfig {

    @Bean("userDao")
    public UserDaoImpl userDao(){
        return new UserDaoImpl();
    }

    @Bean("userService")
    public UserServiceImpl userService(){
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(userDao());
        return userService;
    }

    @Bean("logAspect")
    public LogAspect logAspect() {
        return new LogAspect();
    }
}
