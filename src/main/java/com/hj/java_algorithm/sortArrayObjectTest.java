package com.hj.java_algorithm;

import java.util.*;

class Fruit2 {
    public int weight;
    public int age;

    public Fruit2(int name, int age) {
        this.weight = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + weight + '\'' +
                ", age=" + age +
                '}';
    }

    public int getName() {
        return weight;
    }

    public int getAge() {
        return age;
    }
}


public class sortArrayObjectTest {
    public static void main(String[] args) {

        List<Fruit2> fruits = new ArrayList<>();
        fruits.add(new Fruit2(40, 6));
        fruits.add(new Fruit2(30, 10));
        fruits.add(new Fruit2(30, 1));
        fruits.add(new Fruit2(20, 2));
        Comparator<Fruit2> myComp = new Comparator<Fruit2>() {
            @Override
            public int compare(Fruit2 o1, Fruit2 o2) {
                if ( o1.weight > o2.weight ) {
                    return 1;
                }
                else if ( o1.weight == o2.weight ) {
                    if ( o1.age < o2.age ){
                        return 1;
                    }
                }
                return -1;
            }
        };
        Collections.sort(fruits, myComp);
        for(Fruit2 fruit : fruits)
            System.out.println(fruit.toString());

    }

}
