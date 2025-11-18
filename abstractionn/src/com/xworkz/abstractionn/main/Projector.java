package com.xworkz.abstractionn.main;

public abstract class Projector {
    public abstract void powerOn();
    public abstract void powerOff();
    public abstract void displayContent();
    public abstract void muteAudio();
    public abstract void connectHDMI();

    public static void enableWiFi() {
        System.out.println("Wi-Fi is enabled");
    }
    public void zoomIn() {
        System.out.println("Zoomed in");
    }

    public void zoomOut() {
        System.out.println("zoom out ");
    }

}