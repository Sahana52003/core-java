package com.xworkz.interfaces.intern;

public interface Appliance {
    String brand = "Wiphrool";
    int warrantyYears = 2;
    boolean isAutomatic = true;
    double capacity = 723455.5;
    long serial = 112345002233L;

    void startWash();
    void rinse();
    void spinDry();
    void stopWash();
    void showDetails();
}
