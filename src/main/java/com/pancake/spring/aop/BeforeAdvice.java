package com.pancake.spring.aop;

import java.lang.reflect.Method;

/**
 * Created by zhibingze on 2020/3/24.
 */
public class BeforeAdvice implements Advice {

    private  Object bean;

    private MethodInvocation methodInvocation;

    public BeforeAdvice(Object bean ,  MethodInvocation methodInvocation) {
        this.bean = bean;
        this.methodInvocation = methodInvocation;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        methodInvocation.invoke();
        return method.invoke(bean,args);
    }

}
