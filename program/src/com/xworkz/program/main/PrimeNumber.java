package com.xworkz.program.main;

class PrimeNumber
{
    public static void main(String[] args)
    {
        int num=10;
        if (num<=1){
            System.out.println("Not a prime number");
        } else if (num==2) {
           System.out.println("prime number");
        } else if (num%2==0&&num!=2) {
            System.out.println("NPN");
        }else {
            System.out.println("PN");
        }
    }
}