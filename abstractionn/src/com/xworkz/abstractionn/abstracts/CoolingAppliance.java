package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Refrigerator;

public abstract class CoolingAppliance extends Refrigerator {
    public static long serialNumber = 9876543210L;
    public abstract void coolingLevel(int level);

}
