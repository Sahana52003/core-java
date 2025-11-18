package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Microwave;

public abstract class Electronic extends Microwave {
    public static byte heatLevel = 5;
    public abstract void heat(int temperature);
}
