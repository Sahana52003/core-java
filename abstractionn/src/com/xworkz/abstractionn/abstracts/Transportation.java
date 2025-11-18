package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Vehicle;

public abstract class Transportation extends Vehicle {
    public static short wheels=4;
    public abstract void drive(int speed);
}
