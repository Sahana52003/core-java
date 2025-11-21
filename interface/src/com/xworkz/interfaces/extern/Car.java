package com.xworkz.interfaces.extern;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;
import com.xworkz.interfaces.intern.Vehicle;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Get ready to start through automatic ");
    }

    @Override
    public void changeGear() {
        System.out.println("changing the next gear");
    }

    @Override
    public void brake() {
        System.out.println("brakes applied,to slown down the vehicle");
    }

    @Override
    public void addFuel() {
        System.out.println("fuel is added to the car");
    }

    @Override
    public void stop() {
        System.out.println("Reached destination");
    }
}
