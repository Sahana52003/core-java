package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Mobile;

public class Vivo extends Mobile {
    @Override
    public void powerOn() {
        System.out.println("opened to seee what are there /.");
    }

    @Override
    public void makeCall() {
        System.out.println("make a call");
    }

    @Override
    public void sendMessage() {
        System.out.println("either send messages ");
    }

    @Override
    public void installApp() {
        System.out.println("Installing necessary apps");
    }

    @Override
    public void powerOff() {
        System.out.println("switch of the phone");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music on youtube ");
    }
    }