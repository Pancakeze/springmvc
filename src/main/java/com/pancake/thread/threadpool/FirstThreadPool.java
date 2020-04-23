package com.pancake.thread.threadpool;

import java.io.Serializable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhibingze on 2020/4/20.
 */
public class FirstThreadPool {


    private static int produceTaskSleepTime = 2;
    private static int produceTaskMaxNumber = 10;

    public static void main(String []args){
        ThreadPoolExecutor pool = new ThreadPoolExecutor(2, 4, 3, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3), new ThreadPoolExecutor.DiscardOldestPolicy());

        for(int i=0;i<=produceTaskMaxNumber;i++) {

            try {
                String task = "task@" + i;
                System.out.println("put.." + task);
                pool.execute(new ThreadPoolTask(task));

                Thread.sleep(produceTaskSleepTime);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

class ThreadPoolTask implements Runnable,Serializable {

    private static final long serialVersionUID = 0;
    private static int consumeTaskSleepTime = 2000;


    private Object threadPoolTaskData;

    public ThreadPoolTask(Object tasks) {
        this.threadPoolTaskData = tasks;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("start.."+threadPoolTaskData);

        try {

            Thread.sleep(consumeTaskSleepTime);
        } catch (Exception e) {
            e.printStackTrace();

        }
        threadPoolTaskData = null;
    }

    public Object getTask() {
        return this.threadPoolTaskData;
    }
}
