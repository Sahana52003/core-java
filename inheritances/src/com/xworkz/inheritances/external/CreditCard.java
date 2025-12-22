package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Payment;

public class CreditCard extends Payment {
    public void validateCard() {
        System.out.println("validates the card to use");
    }
    public void cardLimits() {
        System.out.println("checks the limits");
    }
    public void charges() {
        System.out.println("charges are applied to pay");
    }
    public void process() {
        System.out.println("make a payment through card");
    }
    public void details() {
        System.out.println("gives a details about paid money");
    }
}