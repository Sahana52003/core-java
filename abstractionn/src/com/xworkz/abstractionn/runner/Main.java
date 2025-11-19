package com.xworkz.abstractionn.runner;

import com.xworkz.abstractionn.abstracts.App;
import com.xworkz.abstractionn.main.Payment;
import com.xworkz.abstractionn.name.*;

public class Main {
    public static void main(String[] args) {
        Payment payment=new UPI();
        payment.paymentStatus();
        payment.pay();
        payment.refund();
        App.start();
        payment.run();
        payment.stop();
    }
}
