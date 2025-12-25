package com.xworkz.overriding.external;


import com.xworkz.overriding.internal.Vehicle;

public class Car extends Vehicle {
@Override
    public void start(){
    System.out.println("started");
}
}
