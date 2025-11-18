package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Router;

public class TPLRouter extends Router {

    public TPLRouter(String name) {
        super(name);
    }
    @Override
    public void turnOn() {
        System.out.println("ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Can OFF it");
    }

    @Override
    public void connectDevice() {
        System.out.println("connecting device to the network.");
    }

    @Override
    public void disconnectDevice() {
        System.out.println("disconnected from the network.");
    }

    @Override
    public void showStatus() {
        System.out.println("shows status of this router");
    }

    @Override
    public void restart(){
        System.out.println("router is restarting again,,,,");
    }
}