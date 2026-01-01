package com.xworkz.exceptions.main;

public class NullPointer {
    public static void main(String[] args) {
          String name=null;
//        System.out.println(name.charAt(0));
        try{
            System.out.println(name.charAt(0));
        }catch (Exception a){
            System.out.println("gives a null value");
        }finally{
            System.out.println("final block get executed");
        }
    }
}
