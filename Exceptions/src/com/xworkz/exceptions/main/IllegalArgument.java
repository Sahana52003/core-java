package com.xworkz.exceptions.main;

public class IllegalArgument {
    public static void main(String[] args) {
//        int num= Integer.parseInt("abc");
//        System.out.println(num);
      try {
        int num = Integer.parseInt("abc");
    } catch (Exception e) {
        System.out.println("Illegal argument exception");
    } finally {
        System.out.println("Finally block executed");
    }
}
}
