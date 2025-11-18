package com.xworkz.abstractionn.main;

public abstract class Refrigerator {
    public abstract void cool();
    public abstract void freeze();
    public abstract void setTemperature();
    public abstract void defrost();
    public abstract void powerOff();


    public static void powerOn(){
        System.out.println("power is on ");
    }

    public void filterCheck() {
        System.out.println("Check and replace water filter regularly");
    }
    public void givesInformation() {
        System.out.println("Refrigerators keep food fresh, freeze items, and save energy");
    }
}