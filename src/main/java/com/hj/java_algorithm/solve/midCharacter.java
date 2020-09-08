package com.hj.java_algorithm.solve;

import java.util.*;

class Solution2 {
    public String solution(String s) {
        int len = s.length();
        int lenDiv2 = len / 2;
        System.out.println(lenDiv2 + "," + len);
        if ( len % 2 == 0 )
            return s.substring(lenDiv2-1, lenDiv2+1);
        else
            return s.substring(lenDiv2, lenDiv2+1);
    }
}
public class midCharacter {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("abcde"));
        System.out.println(solution2.solution("we"));
    }
}
