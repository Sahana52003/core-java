package com.xworkz.interfaces.intern;

public interface Computer {
    String brand = "HP";
    int ram = 8;
    boolean isAvaliable = true;
    double processorSpeed = 2.5;
    long serialNumber = 8765432100L;

    void boot();
    void shutdown();
    void open();
    void connectToWiFi();
    void close();
}
