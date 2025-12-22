package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Device;

 public class Mobile extends Device {

  public void call() {
        System.out.println("make a call or receive a call");
    }

    public void sendMessage() {
        System.out.println("sending text messages to others");
    }

    public void installApp() {
        System.out.println("installed some applications");
    }

   public void browseInternet() {
        System.out.println("searching through browser");
    }

   public void takePhoto() {
        System.out.println("can edit and take a photo");
    }
}
