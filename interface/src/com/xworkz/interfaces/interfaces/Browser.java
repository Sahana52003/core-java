package com.xworkz.interfaces.interfaces;

public interface Browser {
    String names="Chrome";
    int version=8;
    boolean isValid=true;

    void openTab();
   void closeTab();
   void clearHistory();
}
