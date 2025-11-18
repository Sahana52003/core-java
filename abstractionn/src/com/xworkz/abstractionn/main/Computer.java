package com.xworkz.abstractionn.main;

public abstract class Computer {
   public abstract void open();
   public abstract void conntectInternet();
   public abstract void restart();
   public abstract void copyFile();
   public abstract void shutdown();


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