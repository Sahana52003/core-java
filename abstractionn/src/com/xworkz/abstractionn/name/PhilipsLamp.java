package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Lamp;

public class PhilipsLamp extends Lamp {

    @Override
    public void turnOn() {
        System.out.println("turn on the lamp");
    }

    @Override
    public void turnOff() {
        System.out.println("or turn off it");
    }

    @Override
    public void changeColor() {
        System.out.println("changing color");
    }

    @Override
    public void dim() {
        System.out.println("dim it ");
    }

    @Override
    public void brightness() {
        System.out.println("adjust birghtness");
    }

}