package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Router;

public abstract class Network extends Router {
    public static double bandwidth = 100.5;
    public abstract void connectDevice(String deviceName);
}
