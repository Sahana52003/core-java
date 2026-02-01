package com.xworkz.predicate.external;

import com.xworkz.predicate.runner.Vehicle;

import java.util.function.Predicate;

public class Car {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(3));
        System.out.println(isEven.test(8));
    }
}
