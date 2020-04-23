package com.pancake.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by zhibingze on 2020/4/12.
 */
public class SecondThread extends Thread {

    public SecondThread(){}
    public SecondThread(String name) {
        super(name);
    }

    int i = 0;
    @Override
    public void run() {
        for(;i<100;i++) {
            System.out.println(this.getName() + "--"+i);
        }
    }

    public static void main(String []args){

        new SecondThread("新线程").start();

        // 继承Thread类
        for(int i=0;i<50;i++) {

            if (i == 20) {
                SecondThread s = new SecondThread("被join的线程");
                s.start();
                try {
                    s.join();// 直到该子线程执行完毕后，释放cpu执行其他线程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "--" + i);
        }

        // 实现 Runnable接口
//        for(int i=0;i<50;i++) {
//
//            System.out.println(Thread.currentThread().getName() + "--" + i);
//            if (i == 20) {
//                ThirdThread s= new ThirdThread();
//                new Thread(s, "zbz1").start();
//                new Thread(s, "zbz2").start();
//
//            }
//        }
        // 使用lambda表达式，函数式编程
//        Runnable a =  new Runnable() {
//            @Override
//            public void run() {
//            System.out.println(1);
//            }
//        };
//        new Thread(a).start();

        // 实现Callable接口 call()（函数式编程）
//        FourthThred thred = new FourthThred();
//        FutureTask<Integer> task = new FutureTask(() -> {
//
//            int i=0;
//            for(;i<100;i++) {
//                System.out.println(Thread.currentThread().getName() + "--" + i);
//            }
//            return i;
//        });
//
//
//         for(int i=0;i<50;i++) {
//            System.out.println(Thread.currentThread().getName() + "--" + i);
//            if (i == 20) {
//                new Thread(task,"call返回值的线程").start();
//            }
//        }
//
//        try {
//
//            System.out.println( "子线程的返回值:"+task.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }


    }

}

class ThirdThread implements Runnable{

    int i=0;
    @Override
    public void run() {

        for(;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + "--"+i);
        }
    }
}

class FourthThred{

}
