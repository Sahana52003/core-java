package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Music;

public class Spotify extends Music {
    @Override
    public void play() {
        System.out.println("Playing favorite song.");
    }

    @Override
    public void pause() {
        System.out.println("can pause and start the music.");
    }

    @Override
    public void nextSong() {
        System.out.println("playing next song.");
    }

    @Override
    public void previousSong() {
        System.out.println("either can play previous song or paues,restart.");
    }

    @Override
    public void stop() {
        System.out.println("Can stop it");
    }
}
