package com.xworkz.abstractionn.main;

public abstract class Microwave {
    public abstract void powerOn();
    public abstract void setTimer();
    public abstract void startCooking();
    public abstract void stopCooking();
    public abstract void off();


    public double total;
    public Microwave(double total){
        this();
        this.total=total;
        System.out.println("price of the device " + total);
    }
    public Microwave(){
        System.out.println("Make food");
    }

    public static void openDoor(){

        System.out.println("Opened door to make food");
    }

    public void closeDoor(){

        System.out.println("closed it");
    }

    public void beepSound(){

        System.out.println("Alert when cooking is finished");
    }
}