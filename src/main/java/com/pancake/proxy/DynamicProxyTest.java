package com.pancake.proxy;

/**
 * Created by zhibingze on 2020/3/31.
 */
public class DynamicProxyTest {

    public static void main(String []args){

        //                 不能返回实现类，不然报错              接口类，         代理类
        IJDKProxy proxy = (IJDKProxy) JDKDynamicProxy.agent(IJDKProxy.class, new JDKProxyImpl());
        proxy.say();

    }
}
