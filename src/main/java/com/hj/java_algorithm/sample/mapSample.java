package com.hj.java_algorithm.sample;

import java.util.HashMap;
import java.util.Iterator;

public class mapSample {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("삼십", 30);
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        // 출력1 : Enhacned for문 + get()
        System.out.println("key들의 집합 : " + hm.keySet());
        for (String key : hm.keySet()) {
            System.out.println(String.format("key : %s, value : %s", key, hm.get(key)));
        }

        System.out.println("===========================");
        System.out.println("map remove");
        // remove
        hm.remove("사십");

        // 출력2 : iterator() + get()

        Iterator<String> keys = hm.keySet().iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        }

        System.out.println("===========================");
        System.out.println("map replace");
        // replace
        hm.replace("이십", 200);
        for(String key : hm.keySet()){
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        }

        System.out.println("===========================");
        // size
        System.out.println("맵 size :" + hm.size());

    }

}
