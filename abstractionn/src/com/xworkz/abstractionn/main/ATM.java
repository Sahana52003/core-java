package com.xworkz.abstractionn.main;

public abstract class ATM {
     public abstract void insertCard();
    public abstract void enterPin();
    public abstract void selectTransaction();
    public abstract void processTransaction();
    public abstract void accountStatus();

    public double amount;
    public ATM(double amount){
        this();
        this.amount=amount;
        System.out.println("total amount in the account is " + amount);
    }

    public ATM(){
        System.out.println("current balance");
    }

    public static void changePin(){
        System.out.println("PIN number has been changed ");
    }

    public void dispReceipt(){
        System.out.println("after transaction it will display a receipt");
    }

    public void depositCash(){
        System.out.println("$100 has been deposited into ur acc");
    }
}