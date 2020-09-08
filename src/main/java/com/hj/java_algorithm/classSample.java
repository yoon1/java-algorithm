package com.hj.java_algorithm;

public class classSample {
    private static class Pos {
        int y, x, d;
        public Pos(int y, int x) {
            this.y = y;
            this.x = x;
        }
        public Pos(int y, int x, int d) {
            this.y = y;
            this.x = x;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        Pos p = new Pos(1,2);
        System.out.println(p.y + "," + p.x);
        Pos p2 = new Pos(3,1,5);
        System.out.println(p2.y + "," + p2.x + "," + p2.d);
    }
}
