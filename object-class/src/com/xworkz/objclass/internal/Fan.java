package com.xworkz.objclass.internal;

public class Fan {
    public String brand;
    public int speed;
    public double price;
    public boolean isOn;
    public float weight;

    public Fan(String brand, int speed, double price, boolean isOn, float weight) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
        this.isOn = isOn;
        this.weight = weight;
    }

    public String toString() {
        return "Fan{brand='" + this.brand + "', speed=" + this.speed + ", price=" + this.price + ", isOn=" + this.isOn + ", weight=" + this.weight + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Fan)) {
            return false;
        } else {
            Fan fan = (Fan)obj;
            return this.speed == fan.speed && this.price == (double)fan.speed && this.isOn == fan.isOn && this.brand.equals(fan.brand);
        }
    }

    public int hashCode() {
        int ani = 7;
        int result = 24;
        result = 24 * result + this.brand.hashCode();
        result = 24 * result + this.speed;
        result = 24 * result + (int)this.weight;
        result = 24 * result + (int)this.price;
        result = 24 * result + (this.isOn ? 1 : 0);
        return result;
    }
}
