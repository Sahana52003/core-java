package com.xworkz.abstractionn.main;

public abstract class Lamp {
    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void changeColor();

    public abstract void dim();

    public abstract void brightness();


    public static void blink() {
        System.out.println("Lamp is blinking");
    }


    public void showStatus() {
        System.out.println("Lamp is ON with  brightness 80%");
    }

    public void connectRemote() {
        System.out.println("Lamp connected to remote control.");
    }

}