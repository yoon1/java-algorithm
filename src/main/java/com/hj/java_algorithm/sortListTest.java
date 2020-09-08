package com.hj.java_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

public class sortListTest {
    public static void main(String[] args) {
        /*
        List<String> fruits = new ArrayList<>();
        fruits.add("melon");
        fruits.add("banana");
        fruits.add("grape");
        fruits.add("apple");

        fruits.sort(Comparator.reverseOrder());
        fruits.forEach(System.out::println);
         */

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("grape", "purple"));
        fruits.add(new Fruit("grape", "green"));
        fruits.add(new Fruit("apple", "red"));
        fruits.add(new Fruit("melon", "green"));
        fruits.add(new Fruit("banana", "yellow"));

        sort(fruits, Comparator.comparing(Fruit::getName)
                .thenComparing(Fruit::getColor));

        fruits.forEach(fruit -> System.out.println(fruit.getName() + " : " + fruit.getColor()));
    }
}
