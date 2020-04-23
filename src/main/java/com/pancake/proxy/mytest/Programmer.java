package com.pancake.proxy.mytest;

/**
 * Created by zhibingze on 2020/4/2.
 */
public class Programmer  implements People{

    @Override
    public void say() {
        System.out.println("hello world!");
    }

    @Override
    public void dance() {
        System.out.println(" wa you are  dancer,so good!!");
    }


}
