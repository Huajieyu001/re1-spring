package top.huajieyu001.base.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.huajieyu001.base.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl bean = (UserServiceImpl)c.getBean("userService");
        System.out.println(bean);

    }
}
