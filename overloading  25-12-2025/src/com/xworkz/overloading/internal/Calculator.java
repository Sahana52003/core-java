package com.xworkz.overloading.internal;

public class Calculator {
    public void calculate(){
        System.out.println("Calculated Values are:");
    }

   public int calculate(int a, int b) {
       //System.out.println("The calculated number is : " + (a+b));
       return a+b;
   }

   public void calculate(double a, int b,float c) {
       System.out.println("The calculated number is : " + (a-b-c));
   }

   public void calculate(int a, int b, int c,double e) {
       System.out.println("The calculated number is : " + (a+b+c/e));

   }

    public void calculate(float a, float b,long c, long d,int e, int f) {
        System.out.println("The calculated number is : " + (a*b*c*d*e*f));
   }
}
