package com.xworkz.blocks.main;

 public class Car {
    final static long number;

    static {
        number = 23456L;
        System.out.println("Static block " + number);
    }
     public static void start(){
        System.out.println("started");
    }
     public void stop(){
        System.out.println("stopped");
    }
}
