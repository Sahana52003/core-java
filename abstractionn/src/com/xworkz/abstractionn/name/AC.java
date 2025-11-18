package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.AirConditioner;

public class AC extends AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("can turn off");
    }

    @Override
    public void setTemperature() {
        System.out.println("setting temperatur to 13C");
    }

    @Override
    public void setTimer() {
        System.out.println("Can set time ");
    }

    @Override
    public void activateMode() {
        System.out.println("activated to save energy.");
    }


    @Override
    public void showTemperature(){
        System.out.println("temperature is 25");
    }
}