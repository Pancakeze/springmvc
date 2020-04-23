package com.pancake.thread.day02;

import java.util.Vector;

/**
 * Created by zhibingze on 2020/3/26.
 */
public class VectorPO implements Runnable {

    private Vector<String> vector;
    public VectorPO(Vector<String> vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (String str : vector) {
            System.out.println(Thread.currentThread().getName() + " ---- " + str);
        }
    }

    public static void main(String []args){
        Vector<String> vector2 = new Vector<>();
        vector2.add("1");
        vector2.add("2");
        vector2.add("3");
        vector2.add("4");
        vector2.add("5");
        vector2.add("6");
        System.out.println(vector2.size());

        VectorPO po = new VectorPO(vector2);

        Thread thread = new Thread(po, "1");

        thread.start();

    }
}
