package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Employee;

public class Company extends Employee {
    public void register() {
        System.out.println("Successfully register to start");
    }

    public void hireEmployees() {
        System.out.println("get hires few of employee");
    }

    public void payTaxes() {
        System.out.println("pays taxes to the government");
    }

    public void provideInfrastructure() {
        System.out.println("provides infrastructure");
    }

    public void generateRevenue() {
        System.out.println("Company generates revenue");
    }
}
