package com.xworkz.abstractionn.main;

public abstract class SmartWatch {
    public abstract void trackSteps();
    public abstract void showTime();
    public abstract void measureHeartRate();
    public abstract void call();
    public abstract void powerOff();

    public static void receiveNotification(){
        System.out.println("receiving notifications from the apps");
    }

    public void coonectBluetooth(){
        System.out.println("connect to bluetooth to listen songs");
    }

    public void batteryStatus(){
        System.out.println("remaining 78%");
    }
}