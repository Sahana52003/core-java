package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Vehicle;

public class Car extends Vehicle {

    public void open() {
        System.out.println("opened to sit and drive");
    }

    public void playMusic() {
        System.out.println("can play music");
    }

    public void airConditioning() {
        System.out.println("AC is being on");
    }

    public void numberOfDoors() {
        System.out.println("It has 4 doors");
    }

    public void carType() {
        System.out.println("car type is hyundai");
    }
}
