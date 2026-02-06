package com.xworkz.exception.main;

public class Main {
        static String name="Nandu";
    public static void main(String[] args) {

//        try {
//            throw new Nandu("Message is called");
//        } catch (Exception e) {
//            System.out.println("Exception is handled"+e.getMessage());
//            e.printStackTrace();
//        }
        System.out.println("Execute");
        try {
            run();
        }catch (Nandu e)
        {System.out.println("Doesn't Executed"+e.getMessage());
            e.printStackTrace();
    }
    }
    public static void run() throws Nandu{
        if (name.equalsIgnoreCase("nandu")) {
            throw new Nandu("Gives some message");
        }
    }
}