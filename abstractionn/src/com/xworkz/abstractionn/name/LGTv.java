package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Television;

public class LGTv extends Television {
    @Override
    public void powerOn() {
        System.out.println("Switch on to watch a movie");
    }

    @Override
    public void changeChannel() {
        System.out.println("Cna changed a channel to watch a new ani");
    }

    @Override
    public void increaseVolume() {
        System.out.println("can increase a volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("either can decreased a volume");
    }

    @Override
    public void powerOff() {
        System.out.println("Off the TV");
    }
}
