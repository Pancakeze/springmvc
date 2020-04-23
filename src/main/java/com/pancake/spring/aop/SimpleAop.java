package com.pancake.spring.aop;

import java.lang.reflect.Proxy;

/**
 * Created by zhibingze on 2020/3/24.
 */
public class SimpleAop {

    public static Object getProxy(Object bean, Advice advice) {
        return Proxy.newProxyInstance(SimpleAop.class.getClassLoader(), bean.getClass().getInterfaces(), advice);
    }
}
