package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Microwave;

public class CromaL extends Microwave {
    @Override
    public void powerOn() {
        System.out.println("On to make food");
    }

    @Override
    public void setTimer() {
        System.out.println("setting a time for cooking ");
    }

    @Override
    public void startCooking() {
        System.out.println("After set timer,select a min temperature for food.");
    }

    @Override
    public void stopCooking() {
        System.out.println("get heated then stop ");
    }

    @Override
    public void off() {
        System.out.println("turned off ");
    }

}
