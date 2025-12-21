package com.xworkz.encapsuation.runner;

public class Elevator {
    private float speed;
    private short capacity;

    public Elevator(float speed,short capacity){
        this.speed=speed;
        this.capacity=capacity;
    }

    public void setSpeed(float speed){
        this.speed=speed;
    }

    public float getSpeed(){
        return speed;
    }

    public void setCapacity(short capacity){
        this.capacity=capacity;
    }

    public short getCapacity(){
        return capacity;
    }
}

