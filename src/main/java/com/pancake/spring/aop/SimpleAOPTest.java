package com.pancake.spring.aop;

import com.pancake.service.HelloService;
import com.pancake.service.impl.HelloServiceImpl;
import org.junit.Test;

/**
 * Created by zhibingze on 2020/3/24.
 */
public class SimpleAOPTest {

    @Test
    public void getProxy() throws  Exception {

        MethodInvocation logTask = () -> System.out.println("log task start");
        HelloServiceImpl helloService = new HelloServiceImpl();

        Advice advice = new BeforeAdvice(helloService, logTask);
        HelloService helloServiceImplProxy = (HelloService) SimpleAop.getProxy(helloService, advice);
        helloServiceImplProxy.sayHelloWorld();

    }
}
