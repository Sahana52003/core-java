package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.WashingMachine;

public abstract class CleaningDevice extends WashingMachine {
    public static char name='V';

    public abstract void clean(int duration);

}
