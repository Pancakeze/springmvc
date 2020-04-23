package com.pancake.java.proxy;

import org.junit.Test;

/**
 * Created by zhibingze on 2020/3/25.
 */
public class StaticUserProxy {

    @Test
    public void testStaticProxy() {
        IUserDao iUserDao = new UserDaoImpl();

        UserDaoProxy userDaoProxy = new UserDaoProxy(iUserDao);
        userDaoProxy.save();

    }


}
