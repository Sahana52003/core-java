package com.xworkz.abstractionn.main;

public abstract class Machine {
    public abstract void start();
    public abstract void grindBeans();
    public abstract void brew();
    public abstract void serveCoffee();
    public abstract void stop();

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