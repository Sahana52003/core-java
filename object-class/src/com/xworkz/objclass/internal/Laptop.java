package com.xworkz.objclass.internal;

public class Laptop {
    public String brand;
    public char model;
    public double screenSize;
    public int ram;
    public long number;

    public Laptop() {
        System.out.println("no args Constructor");
    }

    public Laptop(String brand, char model, double screenSize, int ram, long number) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.ram = ram;
        this.number = number;
    }

    public String toString() {
        return "Lenovo{The Laptop name " + this.brand + "and its model type is " + this.model + " screensiz eia " + this.screenSize + " has a capactiyr " + this.ram + " number " + this.number + "}";
    }

    public boolean equals(Object lap) {
        if (this == lap) {
            return true;
        } else if (!(lap instanceof Laptop)) {
            return false;
        } else {
            Laptop laptop = (Laptop)lap;
            return this.brand.equals(laptop.brand) && this.model == laptop.model && this.screenSize == laptop.screenSize && this.ram == laptop.ram && this.number == laptop.number;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.brand.hashCode();
        res = 5 * res + this.model;
        res = 5 * res + (int)this.screenSize;
        res = 5 * res + this.ram;
        res = 5 * res + (int)this.number;
        return res;
    }
}
