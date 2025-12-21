package com.xworkz.encapsuation.runner;

public class Car {
    private int speed;
    private boolean isElectric;

    public Car(int speed,boolean isElectric){
        this.speed=speed;
        this.isElectric=isElectric;
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setIsElectric(boolean isElectric){
        this.isElectric=isElectric;
    }

    public boolean getIsElectric(){
        return isElectric;
    }
}
