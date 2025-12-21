package com.xworkz.intern.extern;

import com.xworkz.intern.interfaces.Browser;

public class Chrome implements Browser {
    @Override
    public void open() {
        System.out.println("Chrome is opened");
    }
}
