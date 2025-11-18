package com.xworkz.abstractionn.main;

public abstract class WashingMachine {
    public abstract void turnOn();
    public abstract void speed();
    public abstract void startWash();
    public abstract void rinse();
    public abstract void turnOff();



    public static void delayStart() {
        System.out.println("Wash clothes will start in");
    }
    public void addDetergent() {
        System.out.println("Adding detergent to it");
    }
    public void spinDry() {
        System.out.println("Spinning clothes to remove excess water");
    }
}