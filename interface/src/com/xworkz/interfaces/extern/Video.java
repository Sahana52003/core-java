package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Media;

public class Video implements Media {
    @Override
    public void play() {
        System.out.println("video is palying ");
    }

    @Override
    public void pause() {
        System.out.println("can pause video without from the start point");
    }

    @Override
    public void stop() {
        System.out.println("After watching the video ,it has to stopped");
    }

    @Override
    public void forward() {
        System.out.println("either can make video forward or back");
    }

    @Override
    public void replay() {
        System.out.println("palying same video again");
    }
}
