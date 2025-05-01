package org.example.dao.impl;

import org.example.dao.UserDao;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @Author huajieyu
 * @Date 4/28/2025 9:59 PM
 * @Version 1.0
 * @Description TODO
 */
@Repository("userDao")
//@Profile("test") // 标注本类在指定环境下生效
public class UserDaoImpl implements UserDao {
}
