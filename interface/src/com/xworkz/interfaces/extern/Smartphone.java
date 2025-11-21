package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Device;

public class Smartphone implements Device {
    @Override
    public void turnOn() {
        System.out.println("phone is opend to check");
    }

    @Override
    public void turnOff() {
        System.out.println("mobile is turn offed");
    }

    @Override
    public void reset() {
        System.out.println("reset the device to open");
    }

    @Override
    public void increaseVolume() {
        System.out.println("increase vloume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decreased sound to watch a movie");
    }
}
