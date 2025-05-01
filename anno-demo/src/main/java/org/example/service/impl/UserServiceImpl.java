package org.example.service.impl;

import org.example.dao.UserDao;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Author huajieyu
 * @Date 4/28/2025 9:17 PM
 * @Version 1.0
 * @Description TODO
 */
@Component("userService")
@Scope("singleton")
@Lazy(false)
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Resource
//    private UserDao userDao2;
//
//    @Autowired
//    public void xxx(UserDao userDao) {
//        System.out.println("xxx: " + userDao);
//    }
//
//    @Autowired
//    public void yyy(List<UserDao> list) {
//        System.out.println("yyy: " + list);
//    }
//
//    public UserServiceImpl() {
//        System.out.println("UserServiceImpl created");
//    }
//
//    @PostConstruct
//    public void init(){
//        System.out.println(userDao2);
//        System.out.println("UserServiceImpl init");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("UserServiceImpl destroy");
//    }


    @Override
    public void print() {
        System.out.println("UserServiceImpl print");
    }
}
