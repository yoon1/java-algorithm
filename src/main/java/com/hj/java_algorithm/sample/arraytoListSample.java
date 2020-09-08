package com.hj.java_algorithm.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraytoListSample {
    public static void main(String[] args) {
        /* list to array */
        /*
        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");
         */
        /*
        String[] array = new String[list.size()];
        int idx = 0;
        for(String e : list) {
            array[idx++] = e;
        }

        for(String e : array) {
            System.out.println(e);
        }*/

        /*
        String[] array = list.toArray(new String[list.size()]);
        for(String e : array) {
            System.out.println(e);
        } */

        /* array to list */
        String[] array = new String[3];
        array[0] = "Test1";
        array[1] = "Test2";
        array[2] = "Test3";
        /*
        List<String> list = new ArrayList<>();
        for(String e : array) {
            list.add(e);
        }
        */
        List<String> list = new ArrayList<>(Arrays.asList(array));
    }
}
