package com.xworkz.interfaces.intern;

public interface Document {
    String name = "ppt";
    int price = 300;
    boolean isPrintable = true;
    double num = 0.75;
    long id= 882221311L;

    void compress();
    void addPage();
    void deletePage();
    void highlightText();
    void rename();
}
