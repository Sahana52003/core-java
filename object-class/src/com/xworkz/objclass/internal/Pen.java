

package com.xworkz.objclass.internal;

public class Pen {
    public String color;
    public int length;
    public double price;
    public boolean refillable;
    public float thickness;

    public Pen(String color, int length, double price, boolean refillable, float thickness) {
        this.color = color;
        this.length = length;
        this.price = price;
        this.refillable = refillable;
        this.thickness = thickness;
    }

    public String toString() {
        return "Pen{color='" + this.color + "', length=" + this.length + ", price=" + this.price + ", refillable=" + this.refillable + ", thickness=" + this.thickness + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Pen)) {
            return false;
        } else {
            Pen pen = (Pen)obj;
            return this.length == pen.length && this.price == this.price && this.refillable == pen.refillable && this.thickness == pen.thickness && this.color.equals(pen.color);
        }
    }

    public int hashCode() {
        int ani = 1;
        int result = 4;
        result = 1 * result + this.color.hashCode();
        result = 1 * result + this.length;
        result = 1 * result + (int)this.price;
        result = 1 * result + (int)this.thickness;
        result = 1 * result + (this.refillable ? 1 : 0);
        return result;
    }
}
