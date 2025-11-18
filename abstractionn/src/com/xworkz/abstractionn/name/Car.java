package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Vehicle;

public class Car extends Vehicle {
    @Override
   public void start(){

        System.out.println("Get ready to start");
    }
    @Override
   public void brake(){

        System.out.println("applied brake to slow down");
    }
    @Override
   public void addFuel(){

        System.out.println("add fuel to car");
    }
    @Override
    public void slowDown(){
        System.out.println("slown down to move");
    }
    @Override
   public void stop(){

        System.out.println("Reached destination");
    }


    @Override
    public void turnLight(){

        System.out.println("Turning lights for better visible");
    }
}