package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Camera;

public class Niko extends Camera {

    public Niko(int price){

        super(price);
    }
    @Override
    public void powerOn() {
        System.out.println("start to capture image");
    }

    @Override
    public void focus() {
        System.out.println("focused on the object to take photo");
    }

    @Override
    public void click() {
        System.out.println("then captured a the image");
    }

    @Override
    public void storeImage() {
        System.out.println("Image is stored in the folder");
    }

    @Override
    public void powerOff() {
        System.out.println("after off to the camera");
    }

    @Override
    public void recordVideo(){
        System.out.println("record video for 15 min and then edit it with songs");
    }
}