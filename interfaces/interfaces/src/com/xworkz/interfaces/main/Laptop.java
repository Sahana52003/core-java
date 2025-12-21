package com.xworkz.interfaces.main;

import com.xworkz.interfaces.exter.Chrome;

public class Laptop {
    Chrome chrome;
    public void open(){

        chrome.run();

    }



    public static void main(String[] args) {
        Laptop laptop1=new Laptop();
        laptop1.open();

    }
}
