package com.xworkz.program.main;

public class Fibonacci
{
    public static void main(String[] args){
        int num=6;
        int first=0;
        int second=1;
        for(int i=0;i<=num;i++){

            int nextNumber=first+second;
            first=second;
            second=nextNumber;
//            System.out.println("The Fibonacci Series are : ");
            System.out.println(first);
        }
    }
}
