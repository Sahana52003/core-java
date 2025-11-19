package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Payment;

public class UPI extends Payment {
    @Override
    public void pay() {
        System.out.println("paying amt through UPi");
    }

    @Override
    public void refund() {
        System.out.println("$300 gets refunded");
    }

    @Override
    public void paymentStatus() {
        System.out.println("checking status if payment had done");
    }

    @Override
    public void run(){
        System.out.println("Running an app");
    }
    @Override
    public void stop() {
        System.out.println("Application has been banned");
    }
}
