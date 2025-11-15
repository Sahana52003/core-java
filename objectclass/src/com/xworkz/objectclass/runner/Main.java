package com.xworkz.objectclass.runner;
import com.xworkz.objectclass.internal.*;
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1=new Vehicle();
        Vehicle vehicle=new Vehicle(8789,56296318404L,5467.234,4567.3456F,'A',true);
        Vehicle vehicle2=new Vehicle(8789,56296318404L,5467.234,4567.3456F,'A',true);
        System.out.println(vehicle.toString());
        System.out.println(vehicle.equals(vehicle2));
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle2.hashCode());
    }
}
