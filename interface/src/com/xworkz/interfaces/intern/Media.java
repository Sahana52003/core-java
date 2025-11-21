package com.xworkz.interfaces.intern;

public interface Media {
    String name = "XYZ";
    int duration = 120;
    boolean isHD = true;
    double size = 150.5;
    long mediaId = 202411L;

    void play();
    void pause();
    void stop();
    void forward();
    void replay();
}
