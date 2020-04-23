package com.pancake.collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhibingze on 2020/4/7.
 */
public class ArraysToList {


    public static void main(String []args){
        final Integer[] arr = {1, 2, 3};

        List<Integer> list = Arrays.asList(arr);

        System.out.println(list);
        System.out.println(list.getClass());
//        System.out.println(list.remove(1));
        System.out.println(list.get(1));

        System.out.println( new ArrayList().getClass());


    }
}
