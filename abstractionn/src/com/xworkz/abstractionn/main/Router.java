package com.xworkz.abstractionn.main;

public abstract class Router {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void connectDevice();
    public abstract void disconnectDevice();
    public abstract void showStatus();


    public static void changePassword(){
        System.out.println("successfuly changed pssd");
    }

    public void connecteddevices(){
        System.out.println("device is connected to others ones");
    }

    public void restart(){
        System.out.println("starts to restart");
    }
}