package com.xworkz.abstractionn.main;

public abstract class AirConditioner {
    public abstract void turnOn();

    public abstract void turnOff();

    public abstract void setTemperature();

    public abstract void setTimer();

    public abstract void activateMode();

    public boolean isAvailable;
    public AirConditioner(boolean isAvailable){
        this();
        this.isAvailable=isAvailable;
        System.out.println("is available in online " + isAvailable);
    }

    public AirConditioner(){
        System.out.println("AirConditioner ");
    }
    public static void checkstatus(){
        System.out.println("It starts coooling");
    }

    public void showTemperature(){
        System.out.println("then the current temperature is 23'");
    }

    public void incTemperature(){
        System.out.println("either can incr or decrase the temperature");
    }

}
