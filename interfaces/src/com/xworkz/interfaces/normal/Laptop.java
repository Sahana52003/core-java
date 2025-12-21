package com.xworkz.interfaces.normal;


import com.xworkz.interfaces.interfacee.Browser;

public class Laptop {
  Browser browser;

  public Laptop(Browser browser){
      this.browser=browser;
  }
  public void start(String msg){
       browser.open();
      System.out.println("get started");
  }
}