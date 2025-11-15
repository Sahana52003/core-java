package com.xworkz.objclass.internal;

public class Chair {
    public String material;
    public int legs;
    public double height;
    public boolean isFoldable;
    public long serialNumber;

    public Chair(String material, int legs, double height, boolean isFoldable, long serialNumber) {
        this.material = material;
        this.legs = legs;
        this.height = height;
        this.isFoldable = isFoldable;
        this.serialNumber = serialNumber;
    }

    public String toString() {
        return "Chair{material='" + this.material + "', legs=" + this.legs + ", height=" + this.height + ", isFoldable=" + this.isFoldable + ", serialNumber=" + this.serialNumber + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Chair)) {
            return false;
        } else {
            Chair chair = (Chair)obj;
            return this.legs == chair.legs && this.height == chair.height && this.isFoldable == chair.isFoldable && this.serialNumber == chair.serialNumber && this.material.equals(chair.material);
        }
    }

    public int hashCode() {
        int ani = 5;
        int result = 14;
        result = 14 * result + (this.isFoldable ? 1 : 0);
        result = 14 * result + (int)this.height;
        result = 14 * result + (int)this.serialNumber;
        result = 14 * result + this.material.hashCode();
        result = 14 * result + this.legs;
        return result;
    }
}
