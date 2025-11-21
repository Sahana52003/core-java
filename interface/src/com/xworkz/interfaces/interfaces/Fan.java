package com.xworkz.interfaces.interfaces;

public interface Fan {
    int price = 3000;
    boolean hasRemote = true;
    long modelNumber = 202411L;
    
    void turnOn();
    void turnOff();
    void remoteControl();
}
