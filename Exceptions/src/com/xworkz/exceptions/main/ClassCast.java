package com.xworkz.exceptions.main;

public class ClassCast {
    public static void main(String[] args) {
        Object x = new Integer(0);
//        System.out.println((String)x);
        try {
            System.out.println((String)x);
        } catch (Exception e) {
            System.out.println("Class cast exception");
        } finally {
            System.out.println("Finally block executed");
        }
}
}
