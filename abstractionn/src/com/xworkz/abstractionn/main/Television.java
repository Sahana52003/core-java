package com.xworkz.abstractionn.main;

public abstract class Television {
    public abstract void powerOn();
    public abstract void changeChannel();
    public abstract void increaseVolume();
    public abstract void decreaseVolume();
    public abstract void powerOff();

    public double price;
    public Television(double price){
        this();
        this.price=price;
        System.out.println("amount of this tv " + price);
    }
    public Television(){
        System.out.println("Watching movies");
    }
    public static void muteVolume(){

        System.out.println("Can incr or mute the volume");
    }

    public void connectWifi(){

        System.out.println("connect tv to wifi");
    }

    public void subtitles(){

        System.out.println("Can change the languages");
    }
}