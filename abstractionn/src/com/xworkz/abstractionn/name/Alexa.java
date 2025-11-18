package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Speaker;

public class Alexa extends Speaker {

    @Override
    public void wakeWord() {

        System.out.println("waiting for a word to listen");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing my favorite music");
    }

    @Override
    public void stopMusic() {

        System.out.println("can pause music and change");
    }

    @Override
    public void answerQuestion() {

        System.out.println("answering a questions");
    }

    @Override
    public void shutDown() {

        System.out.println("off of the alexa");
    }


    @Override
    public void connectToWifi() {

        System.out.println("Wifi is Connected");
    }
}
