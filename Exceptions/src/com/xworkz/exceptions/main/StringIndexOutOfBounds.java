package com.xworkz.exceptions.main;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {

        String name = "Java";
        //System.out.println(name.charAt(10));
        try {
            System.out.println(name.charAt(10));
        } catch (Exception e) {
            System.out.println("Invalid string index");
        } finally {
            System.out.println("Finally block gets executed");
        }
    }
}
