package com.pancake.proxy;

/**
 * Created by zhibingze on 2020/3/31.
 */
public class CglibAgentTest {


    public static void main(String []args){
        CglibAgent cglibAgent = new CglibAgent();
        JDKProxyImpl proxy = (JDKProxyImpl) cglibAgent.getInstance(new JDKProxyImpl());
        proxy.say();
    }
}
