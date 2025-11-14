package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Projector;

public class EpsonPj extends Projector {
    @Override
    public void powerOn() {
        System.out.println("powered on to display");
    }

    @Override
    public void powerOff() {
        System.out.println("off");
    }

    @Override
    public void displayContent() {
        System.out.println("Displaying content on the screen");
    }

    @Override
    public void muteAudio() {
        System.out.println("Can mute or incr audio");
    }

    @Override
    public void connectHDMI() {
        System.out.println("HDMI cable is connected successfully");
    }
}
