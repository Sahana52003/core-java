package com.xworkz.abstractionn.main;

public abstract class Refrigerator {
    public abstract void cool();
    public abstract void freeze();
    public abstract void setTemperature();
    public abstract void defrost();
    public abstract void powerOff();

    public char name;
    public Refrigerator(char name){
        this();
        this.name=name;
        System.out.println("code is  " + name);
    }
    public Refrigerator(){
        System.out.println("Can store food inside it");
    }
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