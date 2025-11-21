package com.xworkz.interfaces.interfaces;

public interface Camera {
    String brand = "Canon";
    int pixels = 24;
    boolean isDigital = true;

    void powerOn();
    void off();
    void click();
}
