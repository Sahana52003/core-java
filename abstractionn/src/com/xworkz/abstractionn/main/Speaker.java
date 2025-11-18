package com.xworkz.abstractionn.main;

public abstract class Speaker {
    public abstract void wakeWord();

    public abstract void playMusic();

    public abstract void stopMusic();

    public abstract void answerQuestion();

    public abstract void shutDown();


    public static void volumeIncrease(){
        System.out.println("increasing the speaker volume");
    }

    public void setAlarm(){
        System.out.println("setting the alaram");
    }

    public void connectToWifi(){
        System.out.println("connecting speaker to wifi network");
    }
}