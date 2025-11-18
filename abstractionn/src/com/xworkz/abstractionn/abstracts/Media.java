package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Music;

public abstract class Media extends Music {
    public static double duration=3.5;
    public abstract void playTrack(String trackName);
}
