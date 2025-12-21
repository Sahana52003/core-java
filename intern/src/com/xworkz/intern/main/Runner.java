package com.xworkz.intern.main;

import com.xworkz.intern.extern.Chrome;
import com.xworkz.intern.extern.Edge;
import com.xworkz.intern.interfaces.Browser;
import com.xworkz.intern.internal.Laptop;

public class Runner {
    public static void main(String[] args) {
        Browser browser1=new Chrome();
        Laptop laptop=new Laptop(browser1);
        laptop.run();

        Browser browser2=new Edge();
        Laptop laptop1=new Laptop(browser2);
        laptop1.run();
    }
}
