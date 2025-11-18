package com.xworkz.abstractionn.main;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public abstract class Music {
    public abstract void play();
    public abstract void pause();
    public abstract void nextSong();
    public abstract void previousSong();
    public abstract void stop();
    public int price;
    public Music(int price){
        this();
        this.price= price;
        System.out.println("total amount is " + price);
    }
    public Music(){
        System.out.println("listening favo. songs");
    }
    public static void shuffle() {
        System.out.println("shuffle the songs");
    }

    public void repeat() {
        System.out.println("same song is repeated");
    }

    public void setVolume() {
        System.out.println("Increase the volume to listen musc " );
    }
}