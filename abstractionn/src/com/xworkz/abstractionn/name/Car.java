package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Vehicle;

public class Car extends Vehicle {
   public void start(){
        System.out.println("Get ready to start");
    }
   public void brake(){
        System.out.println("applied brake to slow down");
    }
   public void addFuel(){
        System.out.println("add fuel to car");
    }
    public void slowDown(){
        System.out.println("slown down to move");
    }
   public void stop(){
        System.out.println("Reached destination");
    }
}