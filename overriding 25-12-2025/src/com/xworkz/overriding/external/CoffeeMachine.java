package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.Appliance;

public class CoffeeMachine extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("switch on to make cofee");
    }
    @Override
    public void turnOff() {
        System.out.println("After that ,it gets off");
    }
    @Override
    public void operate() {
        System.out.println("Brewing coffee to get");
    }
    @Override
    public void clean() {
        System.out.println("Cleaning coffee machine");
    }
    @Override
    public void repair() {
        System.out.println("Repairing coffee machine to start again");
    }
}

