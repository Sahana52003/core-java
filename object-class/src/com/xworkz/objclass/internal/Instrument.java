package com.xworkz.objclass.internal;

public class Instrument {
    public String name;
    public double price;
    protected long code;
    public boolean isAvaliable;
    private float num;

    public Instrument() {
        System.out.println("Instrument");
    }

    public Instrument(String name, double price, long code, float num, boolean isAvaliable) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.num = num;
        this.isAvaliable = isAvaliable;
    }

    public String toString() {
        return "Instrument{Name od the instrument is : " + this.name + " has a price " + this.price + " and it's logo or code value " + this.code + "is the prodct is availble " + this.isAvaliable + "with number" + this.num + "}";
    }

    public boolean equals(Object ins) {
        if (this == ins) {
            return true;
        } else if (!(ins instanceof Instrument)) {
            return false;
        } else {
            Instrument instrument = (Instrument)ins;
            return this.name.equals(instrument.name) && this.price == instrument.price && this.code == instrument.code && this.num == instrument.num && this.isAvaliable == instrument.isAvaliable;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.name.hashCode();
        res = 5 * res + (int)this.price;
        res = 5 * res + (int)this.code;
        res = 5 * res + (this.isAvaliable ? 1 : 0);
        res = 5 * res + (int)this.num;
        return res;
    }
}
