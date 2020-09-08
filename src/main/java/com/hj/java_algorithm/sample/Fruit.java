package com.hj.java_algorithm.sample;

public class Fruit {
     private String name;
     private String color;

     public Fruit() {
         super();
     }

     public Fruit(String name, String color) {
         this.name = name;
         this.color = color;
     }

     @Override
     public String toString() {
         return "Fruit{" +
                 "name='" + name + '\'' +
                 ", age=" + color +
                 '}';
     }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

