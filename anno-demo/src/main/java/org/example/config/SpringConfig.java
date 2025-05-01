package org.example.config;

import org.example.service.UserService;
import org.example.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author huajieyu
 * @Date 4/28/2025 10:21 PM
 * @Version 1.0
 * @Description TODO
 */
@Configurable
@ComponentScan("org.example")
public class SpringConfig {

    @Bean
    public String hello(UserService userService) {
        System.out.println(userService);
        return "hello";
    }

//    @Bean
//    public UserService userService() {
//        return new UserServiceImpl();
//    }
}
