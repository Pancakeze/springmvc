package com.pancake.collection.map;

import org.apache.commons.collections.map.ListOrderedMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhibingze on 2020/4/3.
 */
public class MapCompare {

    public static void main(String []args){

        Map<String, Object> map = new ListOrderedMap(){{
            put("1", 2);
            put("3", 2);
            put("2", 2);
            put("4", 2);
        }};

        Set<Map.Entry<String, Object>> set = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> keyValue = iterator.next();//  set.iterator().next()死循环
            System.out.println(keyValue.getKey() + "----" + keyValue.getValue());
        }

        Map<String, Object> map2 = new HashMap<String, Object>(){{
            put("1", 2);
            put("2", 2);
            put("3", 2);
            put("4", 2);
        }};

        Set<Map.Entry<String, Object>> set2 = map2.entrySet();
        Iterator<Map.Entry<String, Object>> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Object> keyValue = iterator2.next();//  set.iterator().next()死循环
            System.out.println(keyValue.getKey() + "----" + keyValue.getValue());
        }



    }
}
