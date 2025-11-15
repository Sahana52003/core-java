package com.xworkz.objclass.internal;

public class House {
    public String address;
    public int rooms;
    public double price;
    public boolean hasPool;
    public float area;

    public House() {
        System.out.println("house construction");
    }

    public House(String address, int rooms, double price, boolean hasPool, float area) {
        this.address = address;
        this.rooms = rooms;
        this.price = price;
        this.hasPool = hasPool;
        this.area = area;
    }

    public String toString() {
        return "Villa{route to enter the house " + this.address + " ,have a no of rooms " + this.rooms + " and the price of house is " + this.price + " is this house a pool or not " + this.hasPool + " total area is " + this.area + "}";
    }

    public boolean equals(Object hou) {
        if (this == hou) {
            return true;
        } else if (!(hou instanceof House)) {
            return false;
        } else {
            House house = (House)hou;
            return this.address.equals(house.address) && this.rooms == house.rooms && this.price == house.price && this.hasPool == house.hasPool && this.area == house.area;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.address.hashCode();
        res = 5 * res + this.rooms;
        res = 5 * res + (int)this.price;
        res = 5 * res + (this.hasPool ? 1 : 0);
        res = 5 * res + (int)this.area;
        return res;
    }
}
