package com.xworkz.exceptions.main;

public class ArrayStoreException {
    public static void main(String[] args) {
        Object x[] = new String[3];
//        x[0] = new Integer(0);
        try {
                x[0] = new Integer(0);
        } catch (Exception e) {
            System.out.println("Array store Exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }

}
