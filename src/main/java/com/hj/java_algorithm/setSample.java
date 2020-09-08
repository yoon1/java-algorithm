package com.hj.java_algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class setSample {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(100);
        hs.add(10);
        hs.add(-10);
        // remove
        /*
        if ( hs.remove(10))
            System.out.println("remove success : 10");
        else
            System.out.println("remove fail : 10");

        if ( hs.remove(50))


            System.out.println("remove success : 50");
        else
            System.out.println("remove fail : 50");
        */

        // contains
        //System.out.println(hs.contains(100));

        // size
        //System.out.println(hs.size());

        // 자동변환
        //for(int a : hs )
        // System.out.println(a);
        /*
        TreeSet ts = new TreeSet();
        ts.addAll(hs);
        ts.forEach(System.out::println);
        */
        /*
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(100);
        list.add(10);
        list.add(-10);
        Collections.sort(list);
        Set<Integer> unique = new LinkedHashSet<>(list);
        unique.forEach(System.out::println);
        */
        /*
        hs = hs.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        hs.forEach(System.out::println);
        */

        List list = new ArrayList(hs);
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
