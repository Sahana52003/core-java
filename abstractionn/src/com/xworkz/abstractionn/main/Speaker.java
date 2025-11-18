package com.xworkz.abstractionn.main;

public abstract class Speaker {
    public abstract void wakeWord();

    public abstract void playMusic();

    public abstract void stopMusic();

    public abstract void answerQuestion();

    public abstract void shutDown();

    public boolean isQuality;
    public Speaker(boolean isQuality){
        this();
        this.isQuality=isQuality;
        System.out.println("Quality is " + isQuality);
    }
    public Speaker(){
        System.out.println("can incr or decr a volume");
    }
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