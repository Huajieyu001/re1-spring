package top.huajieyu001.base.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import top.huajieyu001.base.service.impl.UserDaoImpl;
import top.huajieyu001.base.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        test4();
    }

    public static void test1() {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
        UserServiceImpl bean = (UserServiceImpl) c.getBean("userService");
        UserDaoImpl bean2 = (UserDaoImpl) c.getBean("userDao");
//        System.out.println(bean);
//        bean.print();
//
//        Object bean1 = c.getBean("person");
//        System.out.println(bean1);
//
//        c.getBean("userService")

        System.out.println(bean.getUserDao());
        System.out.println(bean2.getUserService());
    }

    public static void test2() {
        // ClassPathXmlApplicationContext is lazy load
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Object bean = context.getBean("person");
    }

    public static void test3() {
        // BeanFactory is not lazy load
        ClassPathResource resource = new ClassPathResource("bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Object bean = factory.getBean("person");
    }

    public static void test4(){
        // loop dependency
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object bean = context.getBean("userDao");
        System.out.println(bean);
    }
}
