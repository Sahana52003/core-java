package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Fan;

public abstract class Gadgets extends Fan {
    public static String modes = "Low";
    public abstract void setLevel(int level);
}
