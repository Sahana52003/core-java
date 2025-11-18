package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.AirConditioner;

public abstract class Appliance extends AirConditioner {

   public static String brand="XYZ";
    public abstract void turnOff(int speed);
}
