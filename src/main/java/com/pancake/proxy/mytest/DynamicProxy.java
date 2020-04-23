package com.pancake.proxy.mytest;

import java.lang.reflect.Proxy;

/**
 * Created by zhibingze on 2020/4/2.
 */
public class DynamicProxy {

    private Object proxy;

    public DynamicProxy(Object proxy) {
        this.proxy = proxy;
    }

    public  Object  getProxyInstance() {
       return  Proxy.newProxyInstance(proxy.getClass().getClassLoader(),proxy.getClass().getInterfaces(),
                (proxy1, method, args) -> {

                    System.out.println("代理前");
                    Object ret = method.invoke(proxy, args);
                    System.out.println("代理后");
                    return ret;
                });
    }
}
