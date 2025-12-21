package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.external.Chrome;
import com.xworkz.interfaces.external.Edge;
import com.xworkz.interfaces.interfacee.Browser;
import com.xworkz.interfaces.normal.Laptop;

public class Main {
    public static void main(String[] args) {
        Browser browser=new Chrome();
        browser.open();
        Browser browser1=new Edge();
        Laptop laptop=new Laptop(browser1);
        laptop.start("Hello");
    }
}
