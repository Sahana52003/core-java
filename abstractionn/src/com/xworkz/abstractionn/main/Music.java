package com.xworkz.abstractionn.main;

public abstract class Music {
    public abstract void play();
    public abstract void pause();
    public abstract void nextSong();
    public abstract void previousSong();
    public abstract void stop();

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