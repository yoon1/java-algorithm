package com.hj.java_algorithm.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        System.out.print("\n## 요소의 저장 ##\n");
        // 요소의 저장
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        // 출력 방법 1 : for문 + get() 메소드
        for (int i=0; i < arrList.size() ; i++)
            System.out.print(arrList.get(i) + " ");


        System.out.print("\n## 요소의 제거 ##\n");
        // remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);

        // 출력 방법 2 : Enhanced for문 + get() 메소드
        for(int e : arrList)
            System.out.print(e + " ");

        System.out.print("\n## 요소의 정렬 ##\n");
        // 요소의 정렬 : Collections.sort()
        Collections.sort(arrList);

        // 출력 방법 : iterator() 메소드 + get() 메소드
        Iterator<Integer> it = arrList.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");

        // set 메소드를 이용한 요소의 변경
        System.out.print("\n## 요소의 변경 ##\n");
        arrList.set(0,20);

        for(int e : arrList) {
            System.out.print(e + " ");
        }

        System.out.print("\n## 요소의 갯수 ##\n");
        System.out.print(arrList.size());

    }

}

