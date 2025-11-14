package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Refrigerator;

public class SamsungRef extends Refrigerator {
    @Override
    public void cool() {
        System.out.println("started to cool ");
    }

    @Override
    public void freeze() {
        System.out.println("activated to start");
    }

    @Override
    public void setTemperature() {
        System.out.println("setting temperature for things");
    }

    @Override
    public void defrost() {
        System.out.println("starts to deforst");
    }

    @Override
    public void powerOff() {
        System.out.println("Turn off it");
    }
}
