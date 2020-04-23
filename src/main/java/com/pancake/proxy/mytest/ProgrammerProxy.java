package com.pancake.proxy.mytest;

import java.lang.reflect.Proxy;

/**
 * Created by zhibingze on 2020/4/2.
 */
public class ProgrammerProxy {



    public static void main(String []args){

        // 被代理类
        Programmer programmer = new Programmer();
//
//        // 通过Proxy 生成代理类
//        People programmerProxy = (People)Proxy.newProxyInstance(programmer.getClass().getClassLoader(),
//                programmer.getClass().getInterfaces(),
//                (proxy, method, args1) -> {
//                    System.out.println("before");
//                    Object ret = method.invoke(programmer, args1);
//                    System.out.println("after");
//                    return ret;
//                });
        People people = (People) new DynamicProxy(programmer).getProxyInstance();
        people.say();
        people.dance();

    }
}

