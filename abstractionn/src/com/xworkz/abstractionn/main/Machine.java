package com.xworkz.abstractionn.main;

public abstract class Machine {
    public abstract void start();
    public abstract void grindBeans();
    public abstract void brew();
    public abstract void serveCoffee();
    public abstract void stop();


    public boolean isGood;
    public Machine(boolean isGood){
        this();
        this.isGood=isGood;
        System.out.println("can make a coffee " + isGood);
    }
    public Machine(){
        System.out.println("Making coffeee");
    }

    public static void cleanMachine() {
        System.out.println("Cleaning coffee machine");
    }

    public void addWater() {
        System.out.println("adding water");
    }

    public void addBeans() {
        System.out.println("Coffee beans added to the grinder ");
    }
}