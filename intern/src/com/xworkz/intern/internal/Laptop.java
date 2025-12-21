package com.xworkz.intern.internal;

import com.xworkz.intern.interfaces.Browser;

public class Laptop  {
    Browser browser;

    public Laptop(Browser browser){
        this.browser=browser;
    }

    public void run(){
        browser.open();
    }
}
