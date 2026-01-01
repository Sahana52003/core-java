package com.xworkz.blocks.main;

public class Vehicle {
  final static int cost=100000;
  static {
      System.out.println("Called static block");
  }
    {
        System.out.println("Called non-static block");
    }

    public static void main(String[] args) {
        System.out.println("Main method is called");
        Vehicle vehicle=new Vehicle();
    }
}
