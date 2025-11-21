package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Payment;

public class Creditcard implements Payment {
    @Override
    public void pay() {
        System.out.println("paying amount to other");
    }

    @Override
    public void cancel() {
        System.out.println("canceled payment due to technical issues");
    }

    @Override
    public void checkStatus() {
        System.out.println("checking payment status");
    }

    @Override
    public void showCardNumber() {
        System.out.println("display card number");
    }

    @Override
    public void showLimit() {
        System.out.println("has limit");
    }
}
