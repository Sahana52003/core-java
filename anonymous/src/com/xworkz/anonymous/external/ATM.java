package com.xworkz.anonymous.external;

import com.xworkz.anonymous.internal.Bank;

public class ATM implements Bank {
    @Override
    public Boolean checkBalance() {
        return null;
    }
//    @Override
//    public void deposit() {
//        System.out.println("Amount is deposited");
//    }
//
//    @Override
//    public void withdrawAmount() {
//        System.out.println("Withdraw amount");
//    }

//    public static void main(String[] args) {
//        Bank bank=new ATM();
//        bank.deposit();
//    }
}
