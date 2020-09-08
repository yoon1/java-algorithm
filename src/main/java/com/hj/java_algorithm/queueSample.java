package com.hj.java_algorithm;

import java.util.*;

public class queueSample {
    public static void main(String[] args) {
        /*
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        //출력
        while(!q.isEmpty())
            System.out.println(q.poll());
       */

        // Priority Queue - 오름차순
        /*
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(3);
        pq.add(2);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        */

        // Priority Queue - 내림차순
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq.add(1);
        pq.add(3);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


    }
}
