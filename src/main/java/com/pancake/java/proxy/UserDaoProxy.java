package com.pancake.java.proxy;

/**
 * Created by zhibingze on 2020/3/25.
 */
public class UserDaoProxy implements IUserDao {

    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }
    @Override
    public void save() {
        System.out.println("开启事务");
        target.save();
        System.out.println("提交事务");
    }

    @Override
    public void say() {
        System.out.println(456);
    }
}
