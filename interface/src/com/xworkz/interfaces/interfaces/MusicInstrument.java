package com.xworkz.interfaces.interfaces;

public interface MusicInstrument {
    boolean isPlaying= true;
    double weight = 2.5;
    long instrumentId = 555666777L;

    void play();
    void tune();
    void stop();
}
