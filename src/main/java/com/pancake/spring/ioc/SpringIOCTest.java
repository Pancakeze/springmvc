package com.pancake.spring.ioc;

import org.junit.Test;

/**
 * Created by zhibingze on 2020/3/24.
 */
public class SpringIOCTest {

    @Test
    public void getBean()throws Exception {
        String location = SpringIOC.class.getClassLoader().getResource("ioc.xml").getFile();
        SpringIOC bf = new SpringIOC(location);

        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);

        Car car = (Car) bf.getBean("car");
        System.out.println(car);

    }
}
