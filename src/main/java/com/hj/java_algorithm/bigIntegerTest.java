package com.hj.java_algorithm;

import java.math.BigInteger;

public class bigIntegerTest {
    public static void main(String[] args) {
        int i = 5;
        BigInteger bigNum1 = BigInteger.ZERO; // 0
        BigInteger bigNum2 = BigInteger.ONE; // 0
        BigInteger bigNum3 = BigInteger.TEN; // 0
        BigInteger afterBigNum;

        // 사칙연산 - 다 구현되어 있다!!
        System.out.println(afterBigNum = bigNum1.add(bigNum3)); // +
        System.out.println(afterBigNum = bigNum3.subtract(bigNum2)); // -
        System.out.println(afterBigNum = bigNum2.multiply(bigNum3)); // *
        System.out.println(afterBigNum = bigNum3.divide(bigNum2)); // /

        // 변수와 사칙연산
        afterBigNum = bigNum1.add(BigInteger.valueOf(i));



    }
}

