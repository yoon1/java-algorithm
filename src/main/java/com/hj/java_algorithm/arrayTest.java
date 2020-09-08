package com.hj.java_algorithm;

public class arrayTest {
    public static void main(String[] args) {
        // 1. 2차원 배열 생성
        /*
        int[][] e = new int[3][4];

        // 2. 2차원 배열 인덱스 접근
        e[0][1] = 10;
        //e[1] = 10; // x 사용 불가

        for(int i=0; i < e.length; i++){
            for(int j= 0; j < e[0].length; j++){
                System.out.print(e[i][j] + " ");
            }
            System.out.println();
        }
        */

        // 3. 가변 크기의 2차원 배열 생성
        int[][] f = new int[3][];
        f[0] = new int[1]; // 정수 하나를 담을 수 있는 배열을 생성해서 f의 0번째 인덱스 참조
        f[1] = new int[2]; // 정수 두개를 담을 수 있는 배열을 생성해서 f의 0번째 인덱스 참조
        f[2] = new int[3]; // 정수 세개를 담을 수 있는 배열을 생성해서 f의 0번째 인덱스 참조

        for (int[] ints : f) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        /*
        // 3. 선언과 동시에 초기화
        int[][] g = {{1},{2,3},{4,5,6}};
        for(int i=0; i < g.length; i++){
            for(int j= 0; j < g[i].length; j++){
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
         */
    }
}

