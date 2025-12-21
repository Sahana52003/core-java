package com.xworkz.interfaces.intern;

public interface Payment {
    String name = "UPI";
    int pinNumber = 4;
    boolean isActive = true;
    char code = 'S';
    long phoneNumber = 334452566L;

     void pay();

    void cancel();

    void checkStatus();

    void showCardNumber();

    void showLimit();
}
