package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.name.UPI;

public abstract class App{
    public static void start() {
        System.out.println("App is installed ");
    }
    public void run() {
        System.out.println("application is opend to work");
    }
    public void stop() {
        System.out.println("Just it closed");
    }
}
