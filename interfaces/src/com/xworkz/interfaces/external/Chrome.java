package com.xworkz.interfaces.external;

import com.xworkz.interfaces.interfacee.Browser;

public class Chrome implements Browser {
    @Override
    public void open() {
        System.out.println("In browser,watching a video");
    }
}
