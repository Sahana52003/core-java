package com.xworkz.program.main;

public class Palindrome {

    public   Palindrome(int number){
        int num=number;
        int reverse=0;
        while (number>0) {
            int digit=number%10;//1
             reverse=reverse * 10 + digit;//0*10+1=1-==1
             number=number/10;
        }
            if (num==reverse){
                System.out.println("Paindrme");
            }else {
                System.out.println("Nt paindrme");
            }
        }

//    int n=121;
//    int num=n;
//    int reverse=0;
//    while (num>0){
//        int number=n%10;//1
//        reverse=reverse*10+number;//0*10+1=1-==1
//        n=n/10;//12====
//    }
//if (num==reverse){
//    System.out.println("Paindrme");
//}else {
//            System.out.println("Nt paindrme");
//        }
//        }
        public static void main(String[] args){
        int number=121;
       Palindrome pal=new Palindrome(number);

    }
}