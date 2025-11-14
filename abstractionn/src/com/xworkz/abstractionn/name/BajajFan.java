package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Fan;

public class BajajFan extends Fan {
    @Override
    public void turnOn() {
        System.out.println("turned on the Fan");
    }

    @Override
    public void turnOff() {
        System.out.println("Can switch off the fan");
    }

    @Override
    public void increaseSpeed() {
        System.out.println("increasinf speed to 4");
    }

    @Override
    public void decreaseSpeed() {
        System.out.println("decrease speed to 2");
    }

    @Override
    public void remoteControl() {
        System.out.println("control through remote");
    }
}