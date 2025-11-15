
package com.xworkz.objclass.internal;

public class Phone {
    public String brand;
    public int storage;
    public double price;
    public boolean is5G;
    public char simType;

    public Phone() {
        System.out.println("Info of Phone");
    }

    public Phone(String brand, int storage, double price, boolean is5G, char simType) {
        this.brand = brand;
        this.storage = storage;
        this.price = price;
        this.is5G = is5G;
        this.simType = simType;
    }

    public String toString() {
        return "Mobile{ mobile brand " + this.brand + " has a capacity " + this.storage + " ,and the price is " + this.price + " is the mobile is 4 or 5g " + this.is5G + " with the type of sim " + this.simType + "}";
    }

    public boolean equals(Object pho) {
        if (this == pho) {
            return true;
        } else if (!(pho instanceof Phone)) {
            return false;
        } else {
            Phone phone = (Phone)pho;
            return this.brand.equals(phone.brand) && this.storage == phone.storage && this.price == phone.price && this.is5G == phone.is5G && this.simType == phone.simType;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.brand.hashCode();
        res = 5 * res + this.storage;
        res = 5 * res + (int)this.price;
        res = 5 * res + (this.is5G ? 1 : 0);
        res = 5 * res + this.simType;
        return res;
    }
}
