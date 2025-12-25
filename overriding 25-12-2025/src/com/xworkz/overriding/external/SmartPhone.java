package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.Device;


public class SmartPhone extends Device {
    @Override
    public void start() {
        System.out.println("starts to login");
    }
    public void stop() {
        System.out.println("may closed the mobile");
    }
    public void reset() {
        System.out.println("restart the mobile to boost");
    }
    public void move() {
        System.out.println("can send file/watch/ make call");
    }
    public void install() {
        System.out.println("installing apps through mobile");
    }
}
