package com.xworkz.interfaces.external;

import com.xworkz.interfaces.interfacee.Browser;

public class Edge implements Browser {

    @Override
    public void open() {
        System.out.println("searching for an info");
    }
}
