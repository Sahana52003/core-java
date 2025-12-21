package com.xworkz.encapsul.name;

public class Payment {
    private int pinNumber;
    private double amount;

    public Payment(int pinNumber, double amount) {
        this.pinNumber=pinNumber;
        this.amount=amount;
    }

    public void setPinNumber(int pinNumber){

        this.pinNumber=pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
