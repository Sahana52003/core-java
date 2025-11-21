package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Appliance;

public class WashingMachine implements Appliance {

    @Override
    public void startWash() {
        System.out.println("machine has started to wash clothes");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing clothes with clean water.");
    }

    @Override
    public void spinDry() {
        System.out.println("Spinning clothes to remove excess water.");
    }

    @Override
    public void stopWash() {
        System.out.println("clothes are ready to be removed.");
    }

    @Override
    public void showDetails() {
        System.out.println("gives detailed information about this machine");
    }
}
