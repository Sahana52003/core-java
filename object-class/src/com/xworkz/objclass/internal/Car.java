package com.xworkz.objclass.internal;

public class Car {
    public String brand;
    public int year;
    public double price;
    public long engineSize;
    public boolean isActive;

    public Car(String brand, int year, double price, long engineSize, boolean isActive) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.engineSize = engineSize;
        this.isActive = isActive;
    }

    public Car() {
        System.out.println("has a special feature");
    }

    public String toString() {
        return "Nandu{brand name " + this.brand + " has purchased in " + this.year + " ,cost of the " + this.price + " has a egine " + this.engineSize + " is the brans is available in this cou" + this.isActive + "}";
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (!(object instanceof Car)) {
            return false;
        } else {
            Car car = (Car)object;
            return this.brand.equals(car.brand) && this.year == car.year && this.price == car.price && this.engineSize == car.engineSize && this.isActive == car.isActive;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.brand.hashCode();
        res = 5 * res + this.year;
        res = 5 * res + (int)this.price;
        res = 5 * res + (this.isActive ? 1 : 0);
        res = 5 * res + (int)this.engineSize;
        return res;
    }
}
