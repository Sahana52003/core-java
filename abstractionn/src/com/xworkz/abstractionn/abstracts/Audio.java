package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Speaker;

public abstract class Audio extends Speaker {
    public static double frequency = 18.5;

    public abstract void adjustVolume(int level);
}
