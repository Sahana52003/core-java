package com.xworkz.interfaces.interfaces;

public interface GoogleMap {
    String language="English";
    boolean isOnline=true;
    double rating=5;

    void startNavigation();
    void stopNavigation();
    void searchLocation();
}
