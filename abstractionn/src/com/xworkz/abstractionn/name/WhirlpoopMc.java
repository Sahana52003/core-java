package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.WashingMachine;

public class WhirlpoopMc extends WashingMachine {

    public WhirlpoopMc(int capacity) {
        super(capacity);
    }
    @Override
    public void turnOn() {
        System.out.println("Washing machine turned ON.");
    }

    @Override
    public void speed() {
        System.out.println("can set spped to H,Lor M");
    }

    @Override
    public void startWash() {
        System.out.println("started to wash");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing a  clothes");
    }

    @Override
    public void turnOff() {
        System.out.println("turned off the machine");
    }


    public void addDetergent() {
        System.out.println("Adds detergent to it ");
    }
}