package com.xworkz.interfaces.intern;

public interface Device {
    String brand = "Vivo";
    int year = 2024;
    boolean isBranded = true;
    double price = 1500.50;
    long number = 9456710L;

    void turnOn();
    void turnOff();
    void reset();
    void increaseVolume();
    void decreaseVolume();
}
