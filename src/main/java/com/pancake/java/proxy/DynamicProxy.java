package com.pancake.java.proxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhibingze on 2020/3/25.
 */
public class DynamicProxy implements InvocationHandler {

    private Object object ;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");

        Object result = method.invoke(object, args);

        System.out.println("after");

        return result;
    }


}
