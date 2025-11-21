package com.xworkz.interfaces.implem;
import com.xworkz.interfaces.interfaces.*;
public class Online implements GoogleMap,MusicInstrument,Router,SmartWatch,Television {
    @Override
    public void startNavigation() {
        System.out.println("following route to reach destination");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Reached destination");
    }

    @Override
    public void searchLocation() {
        System.out.println("searching location through the map");
    }

    @Override
    public void play() {
        System.out.println("playing music");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the instrument for perfect sound");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the music");
    }

    @Override
    public void turnOn() {
        System.out.println("Router is powered on");
    }

    @Override
    public void turnOff() {
        System.out.println("Router is powered off");
    }

    @Override
    public void connectDevice() {
        System.out.println("Device connected to the router");
    }

    @Override
    public void trackSteps() {
        System.out.println("Tracking steps taken today");
    }

    @Override
    public void monitorHeartRate() {
        System.out.println("Monitoring heart rate");
    }

    @Override
    public void start() {
        System.out.println(" ready to use");
    }

    @Override
    public void powerOn() {
        System.out.println("TV is ON to watch");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing the channel");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing the volume");
    }
}

