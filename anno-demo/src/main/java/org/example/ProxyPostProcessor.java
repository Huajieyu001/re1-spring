package org.example;

import org.example.adv.Advance;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author huajieyu
 * @Date 4/29/2025 9:34 PM
 * @Version 1.0
 * @Description TODO
 */
@Component
public class ProxyPostProcessor implements BeanPostProcessor, ApplicationContextAware {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass().getPackage().getName().equals("org.example.service.impl")){
            return Proxy.newProxyInstance(
                    bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (Object proxy, Method method, Object[] args) -> {
                        Advance advance = applicationContext.getBean(Advance.class);
                        advance.before();
                        Object result = method.invoke(bean, args);
                        advance.after();
                        return result;
                    }
            );
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    private ApplicationContext applicationContext;
}
