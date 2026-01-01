package com.xworkz.exceptions.main;

public class NegativeArraySize {
    public static void main(String[] args) {
//        int[] arr = new int[-1];
//        System.out.println(arr);
        try {
            int[] arr = new int[-2];
        } catch (Exception e) {
            System.out.println("Array size cannot be negative");
        } finally {
            System.out.println("Finally block gets executed");
        }
}
    }
