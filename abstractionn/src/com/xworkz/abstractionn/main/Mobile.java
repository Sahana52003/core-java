package com.xworkz.abstractionn.main;

public abstract class Mobile {
    public abstract void powerOn();
    public abstract void makeCall();
    public abstract void sendMessage();
    public abstract void installApp();
    public abstract void powerOff();


    public String name;
    public Mobile(String name){
        this();
        this.name=name;
        System.out.println("mobile name " + name);
    }
    public Mobile(){
        System.out.println(" Can watch movies or play games");
    }

    public static void takePhoto() {

        System.out.println("taking photo and then can adjust brightness");
    }

    public void connectWifi() {

        System.out.println("Connected to WiFi network" );
    }

    public void playMusic() {

        System.out.println("Playing music on mobile");
    }
}