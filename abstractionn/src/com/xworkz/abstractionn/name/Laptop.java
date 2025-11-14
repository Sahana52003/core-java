package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Computer;

import javax.jws.soap.SOAPBinding;

public class Laptop extends Computer {
    @Override
    public void open() {
        System.out.println("Opened to start");
    }

    @Override
    public void conntectInternet() {
        System.out.println("Can connect internet vis WiFI");
    }

    @Override
    public void restart() {
        System.out.println("Restarting to open");
    }

    @Override
    public void copyFile() {
        System.out.println("copy file from to folder to another");
    }

    @Override
    public void shutdown() {
        System.out.println("then completely shut down ");
    }
}