package com.pancake.thread;

/**
 * Created by zhibingze on 2018/7/24.
 *
 * 模拟双方的作战行为
 */
public class ArmyRunnable implements Runnable {

    // volatile 保证了线程可以正确的读取其他线程写入的值
    // 可见性 ref JMM,happens-before原则
    volatile boolean flag = true;
    @Override
    public void run() {

        while (flag) {
            for(int i=0;i<5;i++) {
                System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");

                // 让出了处理器时间，下次该谁进攻还不一定呢!
                Thread.yield();
            }

            System.out.println(Thread.currentThread().getName()+"结束了进攻!");
        }
    }
}
