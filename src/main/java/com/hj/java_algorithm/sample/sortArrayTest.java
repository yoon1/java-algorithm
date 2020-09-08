package com.hj.java_algorithm.sample;

import java.util.*;

public class sortArrayTest {
    public static void main(String[] args) {
        String answer = "";
        String[] nums = {"1","2","3","4"};
        Arrays.sort(nums);
        System.out.println("정방향 SORT : ");
        for(String num : nums)
            System.out.println(num);
        /*
        Arrays.sort(nums, new Mycomp());
        System.out.println("역방향 SORT : ");
        for(String num : nums)
            System.out.println(num);
        */
        /*
        System.out.println("역방향 SORT2: ");
        Arrays.sort(nums, Comparator.reverseOrder());
        Arrays.sort(nums, Collections.reverseOrder());
        for(String num : nums)
            System.out.println(num);
        */
        /*
        System.out.println("역방향 SORT3: ");
        Arrays.sort(nums, (o1, o2) -> {
            return o2.compareTo(o1); // 내림차순
        });
         */
    }
}
