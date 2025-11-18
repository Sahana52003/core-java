package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.SmartWatch;

public class AppleWatch extends SmartWatch {
    @Override
    public void trackSteps() {
        System.out.println("It can track total steps a person is walking");
    }

    @Override
    public void showTime() {
        System.out.println("shows updated time");
    }

    @Override
    public void measureHeartRate() {
        System.out.println("measure a heart rate ad so ........");
    }

    @Override
    public void call() {
        System.out.println("can call or recieve a call");
    }

    @Override
    public void powerOff() {
        System.out.println("turn off to charge");
    }

    @Override
    public void batteryStatus(){
        System.out.println("remaind to charge ,");
    }
}