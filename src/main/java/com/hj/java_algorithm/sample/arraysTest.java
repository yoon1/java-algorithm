package com.hj.java_algorithm.sample;

import java.util.Arrays;

public class arraysTest {
    public static void main(String[] args) {
        String[] chars = {"a","b","c","d","e"};
        /* 1. copyOf
        String[] copy_chars = Arrays.copyOf(chars,chars.length);
        for(String ch : copy_chars) {
            System.out.println(ch);
        }
         */
        /* 2. copyOfRange
        String[] copy_chars = Arrays.copyOfRange(chars, 1, 4);
        for(String ch : copy_chars) {
            System.out.println(ch);
        }
        */

        /* 3. fill */
        /*
        Arrays.fill(chars, "a");
        for(String ch : chars) {
            System.out.println(ch);
        }
         */

        /*  4. equals */
        /*
        String[] copy_chars = Arrays.copyOfRange(chars, 1, 4);
        System.out.println(Arrays.equals(chars,copy_chars));
        copy_chars = Arrays.copyOf(chars, chars.length);
        System.out.println(Arrays.equals(chars,copy_chars));
         */

        /* 5. asLsit */
        //System.out.println(Arrays.asList(chars));

        /* 6. sort */
        int ints[] = {5,1,200,11,20};
        Arrays.sort(ints);
        for (int i : ints)
            System.out.println(i);
  }
}
