package com.xworkz.abstractionn.main;

public abstract class Vehicle {
    public abstract void start();
    public abstract void brake();
    public abstract void addFuel();
    public abstract void slowDown();
    public abstract void stop();


    public static void horn(){
        System.out.println("horn the vehicle to move");
    }

    public void playMusic(){
        System.out.println("music is playing");
}
    public void turnLight(){
        System.out.println("can turn on or off the lights");}
}