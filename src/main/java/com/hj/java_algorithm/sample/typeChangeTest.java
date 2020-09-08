package com.hj.java_algorithm.sample;

import org.springframework.aop.scope.ScopedProxyUtils;

import java.math.BigInteger;

public class typeChangeTest {
    public static void main(String[] args) {
        /*
        // String to int
        String from_str = "123";
        int to_int = Integer.parseInt(from_str);
        System.out.println(to_int);

        // int to String
        int from_int = 123;
        String to_str = Integer.toString(from_int);
        System.out.println(to_str + ", " + to_str.getClass());

        // int to String (2)
        int from_int2 = 100;
        String to_str2 = String.valueOf(from_int2);
        System.out.println(to_str2 + ", " + to_str2.getClass());
        */
        // 최대, 최소
        System.out.println("정수의 최대값 : " + Long.MAX_VALUE);
        System.out.println("정수의 최소값 : " + Long.MIN_VALUE);
        System.out.println();

        BigInteger bigValue1 = new BigInteger("100000000000000000000000000");
        BigInteger bigValue2 = new BigInteger("-99999999999999999999999999");

        System.out.println(" 더하기 : " + bigValue1.add(bigValue2));
        System.out.println(" 빼기 : " + bigValue1.subtract(bigValue2));

    }
}
