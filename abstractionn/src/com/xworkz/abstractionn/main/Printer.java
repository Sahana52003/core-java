package com.xworkz.abstractionn.main;

public abstract class Printer {
    public abstract void powerOn();
    public abstract void printDocument();
    public abstract void scanDocument();
    public abstract void printPhoto();
    public abstract void powerOff();


    public static void testPrint(){
        System.out.println("Test page printed successfully");
    }

    public void loadPaper(){
        System.out.println("paper is loaded to print");
    }

    public void connectWiFi(){
        System.out.println("connected to scan the documents,print");
    }
}