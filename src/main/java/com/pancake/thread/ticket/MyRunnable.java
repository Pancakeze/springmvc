package com.pancake.thread.ticket;

/**
 * Created by zhibingze on 2018/7/27.
 */
public class MyRunnable implements  Runnable {

    private volatile int ticketCount = 20;

    @Override
    public void run() {
        while (ticketCount >0) {
            ticketCount--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为："+ticketCount);
        }
    }
}
