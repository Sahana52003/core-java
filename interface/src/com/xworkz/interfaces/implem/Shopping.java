package com.xworkz.interfaces.implem;

import com.xworkz.interfaces.interfaces.App;
import com.xworkz.interfaces.interfaces.Browser;
import com.xworkz.interfaces.interfaces.Fan;
import com.xworkz.interfaces.interfaces.*;

public class Shopping implements App, Browser,Camera,Drone, Fan {

    @Override
    public void searchProduct() {
        System.out.println("searching product in online");
    }

    @Override
    public void addToCart() {
        System.out.println("product is added to cart");
    }

    @Override
    public void checkout() {
        System.out.println("checking item before adding to cart");
    }

    @Override
    public void openTab() {
        System.out.println("opened a browser to search ");
    }

    @Override
    public void closeTab() {
        System.out.println("closed after getting information from this site");
    }

    @Override
    public void clearHistory() {
        System.out.println("deleting search history");
    }

    @Override
    public void turnOn() {
        System.out.println("switch on the fan");
    }

    @Override
    public void turnOff() {
        System.out.println("turning off.");
    }

    @Override
    public void remoteControl() {
        System.out.println("through the remote ,can on or off the fan");
    }

    @Override
    public void powerOn() {
        System.out.println("Camera is opened to take photos ");
    }

    @Override
    public void off() {
        System.out.println("closed or off");
    }

    @Override
    public void click() {
        System.out.println("photo is clicked");
    }

    @Override
    public void takeOff() {
        System.out.println("it is started and then slowly lifting off");
    }

    @Override
    public void land() {
        System.out.println("It is landed safely ");
    }

    @Override
    public void checkBattery() {
        System.out.println("Checking drone battery level");
    }
}
