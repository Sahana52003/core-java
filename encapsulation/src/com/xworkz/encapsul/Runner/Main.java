package com.xworkz.encapsul.Runner;

import com.xworkz.encapsul.name.Payment;

public class Main {
    public static void main(String[] args) {
//       Payment payment=new Payment();
//        payment.setPinNumber(3456);
//        System.out.println(payment.getPinNumber());
//        payment.setAmount(3000);
//        System.out.println(payment.getAmount());
        Payment payment1=new Payment(1234,1000);
        payment1.setPinNumber(3456);

        System.out.println(payment1.getPinNumber());
        System.out.println(payment1.getAmount());
    }
}
