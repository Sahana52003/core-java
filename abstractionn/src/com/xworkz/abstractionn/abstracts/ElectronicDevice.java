package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Computer;

public abstract class ElectronicDevice extends Computer {
    public static double speed = 13.6;
    public abstract void turnOn(boolean isInstalled);
}
