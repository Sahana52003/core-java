package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Computer;

public class Laptop implements Computer {
    @Override
    public void boot() {
        System.out.println("restarting");
    }

    @Override
    public void shutdown() {
        System.out.println("shutdown to restart the laptop");
    }

    @Override
    public void open() {
        System.out.println("opened to start work");
    }

    @Override
    public void connectToWiFi() {
        System.out.println("connecting to Wi-Fi.");
    }

    @Override
    public void close() {
        System.out.println("after work ,closing the laptop");
}
}
