package com.xworkz.encapsuation.runner;

public class Mobile {
    private short battery;
    private int warranty;

    public Mobile(short battery,int warranty){
        this.battery=battery;
        this.warranty=warranty;
    }

    public void setBattery(short battery){
        this.battery=battery;
    }

    public short getBattery(){
        return battery;
    }

    public void setWarranty(int warranty){
        this.warranty=warranty;
    }

    public int getWarranty(){
        return warranty;
    }
}
