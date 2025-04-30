package org.example.dao.impl;

import org.example.dao.AopService;
import org.springframework.stereotype.Component;

/**
 * @Author huajieyu
 * @Date 4/29/2025 9:45 PM
 * @Version 1.0
 * @Description TODO
 */
@Component
public class AopServiceImpl implements AopService {

    @Override
    public void sayHello() {
        System.out.println("hello");
    }
}
