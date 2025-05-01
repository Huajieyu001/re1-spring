package org.example.adv;

import org.springframework.stereotype.Component;

/**
 * @Author huajieyu
 * @Date 4/29/2025 9:38 PM
 * @Version 1.0
 * @Description TODO
 */
@Component
public class Advance {

    public void before(){
        System.out.println("Before Advance");
    }

    public void after(){
        System.out.println("After Advance");
    }
}
