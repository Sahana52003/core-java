package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Account;

public class SavingAccount implements Account {
    @Override
    public void deposit() {
        System.out.println("amount is deposited to your account");
    }

    @Override
    public void withdraw() {
        System.out.println("withdraw amount from savings account");
    }

    @Override
    public void checkBalance() {
        System.out.println("checking balance in account");
    }

    @Override
    public void printStatement() {
        System.out.println("giving statement about account");
    }

    @Override
    public void closeAccount() {
        System.out.println("account is closed after withdarw ammount");
    }
}
