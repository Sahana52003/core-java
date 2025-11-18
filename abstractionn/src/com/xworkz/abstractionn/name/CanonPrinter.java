package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Printer;

public class CanonPrinter extends Printer {

    public CanonPrinter(char code) {
        super(code);
    }
    @Override
    public void powerOn() {
        System.out.println("Turn On to print doc");
    }

    @Override
    public void printDocument() {
        System.out.println("printing no. of docum");
    }

    @Override
    public void scanDocument() {
        System.out.println("Can scan and print");
    }

    @Override
    public void printPhoto() {
        System.out.println("printing total photos ");
    }

    @Override
    public void powerOff() {
        System.out.println("off of the printer");
    }

    @Override
    public void connectWiFi(){
        System.out.println("printing the documents,papers");
    }
}