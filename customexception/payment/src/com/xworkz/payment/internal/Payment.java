package com.xworkz.payment.internal;

import com.xworkz.payment.external.OnlineException;

public class Payment {
  static boolean isPayed=true;
    public static void main(String[] args) {
        System.out.println("Payment status");
        try {
            paymentDone();
        }catch (OnlineException oe){
            System.out.println(oe.getMessage());
        }
    }
    public static void paymentDone() throws OnlineException{
        if(isPayed==false){
            System.out.println("payment is done");
        }else {
            System.out.println("Not done payment");
        }
    }
}
