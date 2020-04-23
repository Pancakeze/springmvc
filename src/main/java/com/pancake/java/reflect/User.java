package com.pancake.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by zhibingze on 2020/3/25.
 */
public class User {

    private String name;

//    public User(String name) {
//        this.name = name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String [] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class clazz = User.class;
        System.out.println(clazz);
        User user = (User)clazz.newInstance();
        Method method = clazz.getDeclaredMethod("setName", String.class);
        method.invoke(user, "123");

        Field name = clazz.getDeclaredField("name");
        System.out.println(name.get(user));
//        System.out.println(name);
    }

}
