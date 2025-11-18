package com.xworkz.abstractionn.main;

public abstract class Fan {
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void increaseSpeed();
    public abstract void decreaseSpeed();
    public abstract void remoteControl();


    public static void showingStatus(){
        System.out.println("showing if the fan is on or off");
    }

    public void connectApp(){
        System.out.println("It is connect to smartphone");
    }

    public void clean(){
        System.out.println("cleaning");
    }
}