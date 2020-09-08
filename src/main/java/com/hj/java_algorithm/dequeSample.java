package com.hj.java_algorithm;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class dequeSample {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("add : 1");
        dq.add("add : 2");
        dq.addFirst("First : 3");
        dq.addLast("Last : 4");

        /*
        Iterator<String> it = dq.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println(dq.size());

        while(!dq.isEmpty())
            System.out.println(dq.poll());
        System.out.println(dq.size());
         */

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}

