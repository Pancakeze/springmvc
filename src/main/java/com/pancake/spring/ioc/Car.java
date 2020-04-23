package com.pancake.spring.ioc;

import lombok.Data;

/**
 * Created by zhibingze on 2020/3/24.
 */

@Data
public class Car {

    private String name;

    private String length;

    private String width;

    private String height;

    private Wheel wheel;
}
