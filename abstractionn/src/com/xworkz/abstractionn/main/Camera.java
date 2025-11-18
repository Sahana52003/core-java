package com.xworkz.abstractionn.main;

public abstract class Camera {
    public abstract void powerOn();
    public abstract void focus();
    public abstract void click();
    public abstract void storeImage();
    public abstract void powerOff();

    public int price;
        public Camera(int price){
            this();
            this.price=price;
            System.out.println("total price of the camera is " + price);
        }

        public Camera(){
            System.out.println("Taking pictures");
        }


    public static void deleteImg(){
        System.out.println("deleted image from this ");
    }

    public void recordVideo(){
        System.out.println("recording video for 3 r 5 min");
    }

    public void zoom(){
        System.out.println("can zoom to see the pic clearly");
    }
}