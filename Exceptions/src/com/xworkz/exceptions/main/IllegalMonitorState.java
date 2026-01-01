package com.xworkz.exceptions.main;

public class IllegalMonitorState {
    public static void main(String[] args) throws InterruptedException {
        String str = "Hello";
//        str.wait();
        try {
            str.wait();
        } catch (Exception e) {
            System.out.println("Illegal monitor exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
