package com.xworkz.inheritances.external;

import com.xworkz.inheritances.intern.Manager;

public class Employee extends Manager {
   public void work() {
        System.out.println("doing assigned work");
    }
    public void meeting() {
        System.out.println("meeeting is scheduled to attend");
    }
    public void report() {
        System.out.println("submit report in a date");
    }
}
