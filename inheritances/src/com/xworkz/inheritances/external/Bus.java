package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Vehicle;

public class Bus extends Vehicle {
    public void startEngine() {
        System.out.println("Bus started");
    }
    public void stopEngine() {
        System.out.println("stopped");
    }
    public void cleanBus() {
        System.out.println("Cleaning a bus");
    }
    public void onLights() {
        System.out.println("lights turn on to driver bus");
    }
    public void honk() {
        System.out.println("honked");
    }
}
