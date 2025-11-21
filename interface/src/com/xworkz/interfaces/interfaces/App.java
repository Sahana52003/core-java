package com.xworkz.interfaces.interfaces;

public interface App {
    String modelName = "shopping";
    int items = 3;
    boolean isAvaliable = true;

    void searchProduct();
    void addToCart();
    void checkout();
}
