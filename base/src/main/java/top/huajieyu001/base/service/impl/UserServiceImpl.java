package top.huajieyu001.base.service.impl;

import top.huajieyu001.base.service.UserDao;
import top.huajieyu001.base.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    static {
        System.out.println("UserServiceImpl 被加载");
    }

    public void print() {
        System.out.println("print");
    }

    public void init(){
        System.out.println("init at user");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        System.out.println("this.userDao = userDao;");
        this.userDao = userDao;
    }
}
