package com.xworkz.interfaces.interfaces;

public interface Drone {
    int maxSpeed = 120;
    char name='X';
    double value = 40.5;


    void takeOff();
    void land();
    void checkBattery();
}
