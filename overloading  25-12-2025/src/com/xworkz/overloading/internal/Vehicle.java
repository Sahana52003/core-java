package com.xworkz.overloading.internal;

public class Vehicle {
    public void start(byte number) {
            System.out.println("vehicle number : " + number);
        }
    public void start(short code, int gearNumber) {
            System.out.println("code is : " +  code + " number is : " + gearNumber);
        }
    public void start(long engineNumber, float fuelLevel, char name) {
            System.out.println("vehicle's engine number is : " + engineNumber +
                    " level is " + fuelLevel + " code name : " + name);
        }
    public void start(double cost, boolean isElectric,
                   byte noOfKeys, short batteryLevel) {
            System.out.println("amount of Vehicle is : " + cost +
                    " is Electric or not : " + isElectric + " having keys : " + noOfKeys + " Battery: " + batteryLevel);
        }
    public void start(int gear, long serial, int fuelCost,
                   String name, char mode, boolean isRemote) {
            System.out.println("Gears : " + gear +
                    " SerialNumber : " + serial + " fuel cost is : " + fuelCost +
                    "vehicle name is : " + name + " their mode is : " + mode + " isRemote : " + isRemote);
        }
    }