package com.xworkz.overloading.internal;

public class Delivery {
   public void deliver(long mobileNumber) {
        System.out.println("register mobile number is : " + mobileNumber);
    }
    public void deliver(String address, int time) {
        System.out.println("delivered address is : " + address + "shows delivered time " + time + " hours");
    }
    public void deliver(String payment, double cost, char code) {
        System.out.println("payment mode is  " + payment +
                "and cost is " + cost +
                "product code is : " + code);
    }
    public void deliver(String name ,short value, boolean isDelivered, float discount) {
        System.out.println("product name is : " + name +
                "parcle size" + value + "is product is delivered at a time : " + isDelivered +
                "gives product discount : " + discount);
    }
    public void deliver(String address, int time, boolean isAvailable,
                 double distance, char vehicleType, float cost) {
        System.out.println("Address Type " + address +
                "shows time to deliver : " + time + "Product is available in this website : " + isAvailable +
                ", Distance: " + distance + "delivered vehicle number is " + vehicleType + "total amount is " + cost);
    }
}

