package com.xworkz.encapsuation.main;

import com.xworkz.encapsuation.runner.*;

public class Encapsulation {
    public static void main(String[] args) {
        Car car = new Car(120, true);
        System.out.println(car.getSpeed());
        System.out.println(car.getIsElectric());

        System.out.println("==============");
        Elevator elevator = new Elevator(2.5f, (short) 8);
        System.out.println(elevator.getCapacity());
        System.out.println(elevator.getSpeed());
        System.out.println("==============");

        Mobile mobile=new Mobile((short)5000,2);
        System.out.println(mobile.getBattery());
        System.out.println(mobile.getWarranty());

        System.out.println("==============");

        Wifi wifi=new Wifi("SORA","gfhjiewd4567@u");
        System.out.println(wifi.getName());
        System.out.println(wifi.getPassword());
    }
}
