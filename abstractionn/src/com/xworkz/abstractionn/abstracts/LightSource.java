package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Lamp;

public abstract class LightSource extends Lamp {
    public static int brightness=10;
    public abstract void adjustBrightness(int value);
}
