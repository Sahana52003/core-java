package com.xworkz.intern.extern;

import com.xworkz.intern.interfaces.Browser;

public class Edge implements Browser {
    @Override
    public void open() {
        System.out.println("edge is opened");
    }
}
