package com.pancake.java.proxy;

/**
 * Created by zhibingze on 2020/3/25.
 */
public class UserDaoImpl implements IUserDao {

    @Override
    public void save() {
        System.out.println("保存数据");
    }

    @Override
    public void say() {
        System.out.println(123);
    }


}
