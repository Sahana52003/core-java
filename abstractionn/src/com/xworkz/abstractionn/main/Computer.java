package com.xworkz.abstractionn.main;

import java.awt.*;

public abstract class Computer {
   public abstract void open();
   public abstract void conntectInternet();
   public abstract void restart();
   public abstract void copyFile();
   public abstract void shutdown();

    public String name;
    public Computer(String name){
        this();
        this.name=name;
        System.out.println("name of the device " + name);
    }
    public Computer(){
        System.out.println("either can install or watch videos");
    }
   public static void updateSystem(){
       System.out.println("checking systems to update any things");
   }

   public void installApp(){
       System.out.println("Installing some of the apps ");
   }

   public void runProgram(){
       System.out.println("Running my programs");
   }
}