package com.xworkz.exception.main;

public class Main {

    public static void start(){
        stop();
    }

    public static void stop(){
        start();
    }
    public static void main(String[] args) {
      start();
    }
}
