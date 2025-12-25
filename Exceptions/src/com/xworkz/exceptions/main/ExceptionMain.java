package com.xworkz.exceptions.main;

public class ExceptionMain {
    static String name=null;
    public static void main(String[] args) {
        try {
            char x = name.charAt(1);
            System.out.println(x);
        }catch(Exception e){
            System.out.println("Gets executed");
        }
//        }finally {
//            System.out.println("final block get executed");
//        }
    }
}