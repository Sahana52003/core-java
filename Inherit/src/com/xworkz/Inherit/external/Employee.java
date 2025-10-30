package com.xworkz.Inherit.external;

import com.xworkz.Inherit.internal.Company;

public class Employee extends Company {
    public void login() {
        System.out.println("Employee is logged into the office");
    }

    public void logout() {
        System.out.println("Time to leave the office");
    }
}