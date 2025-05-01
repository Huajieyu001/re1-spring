package org.example;

import org.example.config.SpringConfig;
import org.example.service.AopService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
     * @Author huajieyu
     * @Date 4/28/2025 9:35 PM
     * @Version 1.0
     * @Description TODO
     */
    public class Main {

        public static void main(String[] args) {
    //        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    //
    //        Object userService = context.getBean("userService");
    //        Object userService2 = context.getBean("userService");
    //        System.out.println(userService);
    //        System.out.println(userService2);
    //
    //        context.close();
    //        System.out.println("HHH");

            ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    //        UserService userService = (UserService) context.getBean("userService");
    //        AopImpl bean = context.getBean(AopImpl.class);
            AopService bean2 = context.getBean(AopService.class);

            bean2.sayHello();

    //        System.out.println(userService);
        }
    }