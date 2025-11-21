package com.xworkz.interfaces.intern;

public interface Account {
    String bankName = "SBI";
    int accountNumber = 123456;
    boolean isActive = true;
    double balance = 5000.75;
    long contact = 9876543210L;

    void deposit();
    void withdraw();
    void checkBalance();
    void printStatement();
    void closeAccount();
}
