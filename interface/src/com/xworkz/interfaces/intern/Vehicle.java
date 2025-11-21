package com.xworkz.interfaces.intern;

public interface Vehicle {
    String type="transport";
    int noOfWheels=4;
    boolean isElectric=true;
    double price=40000;
    long number=3456789076L;
    void start();
    void changeGear();
    void brake();
    void  addFuel();
    void stop();
}
