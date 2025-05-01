package top.huajieyu001.base.service.impl;

import top.huajieyu001.base.service.UserDao;
import top.huajieyu001.base.service.UserService;

public class UserDaoImpl implements UserDao {

    private UserService userService;

    static {
        System.out.println("UserServiceImpl 被加载");
    }

    public void print() {
        System.out.println("print");
    }

    public void init(){
        System.out.println("init at user");
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        System.out.println("this.userService = userService;");
        this.userService = userService;
    }
}
