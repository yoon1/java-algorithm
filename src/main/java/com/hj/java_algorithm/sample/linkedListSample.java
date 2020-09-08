package com.hj.java_algorithm.sample;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;

public class linkedListSample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        // add()메소드를 이용한 요소의 저장
        linkedList.add("넷");
        linkedList.add("셋");
        linkedList.add("하나");
        linkedList.add("둘");


        // sort
        Collections.sort(linkedList);

        // for문 + get()
        for(int i=0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }

        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(1);
        dq.add(2);
        for(Integer a : dq) {
            System.out.println(a);
        }



    }
}

