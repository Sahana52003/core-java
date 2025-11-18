package com.xworkz.abstractionn.main;

public abstract class Vehicle {
    public abstract void start();
    public abstract void brake();
    public abstract void addFuel();
    public abstract void slowDown();
    public abstract void stop();

    public String name;
    public Vehicle(String name){
        this();
        this.name=name;
        System.out.println("name of the vehicle " + name);
    }
    public Vehicle(){
        System.out.println(" easy for people to travel ");
    }
    public static void horn(){
        System.out.println("horn the vehicle to move");
    }

    public void playMusic(){
        System.out.println("music is playing");
}
    public void turnLight(){
        System.out.println("can turn on or off the lights");}
}