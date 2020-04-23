package com.pancake.java.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by zhibingze on 2020/3/25.
 */
public class DynamicProxyTest {


    @Test
    public void test() {
        DynamicProxy dynamicProxy = new DynamicProxy(new UserDaoImpl());
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        IUserDao userDaoProxy=  (IUserDao) Proxy.newProxyInstance(IUserDao.class.getClassLoader(), new Class[]{IUserDao.class}, dynamicProxy);

        userDaoProxy.save();

        userDaoProxy.say();

    }
}
