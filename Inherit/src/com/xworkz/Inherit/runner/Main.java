package com.xworkz.Inherit.runner;

import com.xworkz.Inherit.external.Employee;
import com.xworkz.Inherit.internal.Company;

public class Main {
    public static void main(String[] args) {
        Company company=new Company();
        company.operate();
        company.report();
        Employee employee=new Employee();
        employee.login();
        employee.logout();
        Company comp=new Employee();
        comp.operate();
        comp.report();
        Employee employee1=(Employee) comp;
        employee1.login();
        employee1.logout();
        employee1.operate();
        employee1.report();

    }
}
