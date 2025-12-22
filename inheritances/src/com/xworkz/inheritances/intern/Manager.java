package com.xworkz.inheritances.intern;

import com.xworkz.inheritances.internal.Company;

public class Manager extends Company {
    public void assign() {
        System.out.println("assign task to employees");
    }
    public void evaluate() {
        System.out.println("evaluating work done by employee");
    }
    public void plan() {
        System.out.println("gives project plans to implement");
    }
}
