package com.xworkz.exceptions.main;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
//        int[] a={1,3,5,3,6};
//        System.out.println(a[9]);
        try {
            int[] a={1,3,5,3,6};
            System.out.println(a[7]);
        } catch (Exception e) {
            System.out.println("invalid index");
        }finally{
            System.out.println("may executed ");
        }
    }
}