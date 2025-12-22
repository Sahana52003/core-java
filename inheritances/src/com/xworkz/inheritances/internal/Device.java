package com.xworkz.inheritances.internal;

public class Device {

    public void powerOn() {
        System.out.println("power mode is on ");
    }

   public void powerOff() {
        System.out.println("out of charge");
    }

   public void charge() {
        System.out.println("charging to get 100%");
    }

   public void connectToNetwork() {
        System.out.println("connected to network");
    }

    public void checkBattery() {
        System.out.println("status of battery level");
    }
}
