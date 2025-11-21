package com.xworkz.interfaces.interfaces;

public interface SmartWatch {
    int total = 5000;
    boolean isValid = true;
    String brandName="Apple";
    long modelNumber = 2345L;

    void trackSteps();
    void monitorHeartRate();
    void start();
}
