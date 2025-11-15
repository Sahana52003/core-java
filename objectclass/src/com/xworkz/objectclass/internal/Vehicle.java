package com.xworkz.objectclass.internal;

public class Vehicle {
    public int price;
    public long phoneNumber;
    public double total;
    public float cal;
    public char x;
    public boolean isAvaliable;

    public Vehicle(){
        System.out.println("No Args Constructor");
    }
    public Vehicle(int price,long phoneNumber,double total,float cal,char x,boolean isAvaliable){
        this.price=price;
        this.phoneNumber=phoneNumber;
        this.total=total;
        this.cal=cal;
        this.x=x;
        this.isAvaliable=isAvaliable;
    }
    public String toString(){
        return "Car{and the price is "+price+",mobileNumber "+phoneNumber+",cal"+cal+",code"+x+"" +
                "where is Avaliable"+isAvaliable+"}";
    }
    public boolean equals(Object veh) {
        if (this == veh)
            return true;
        if (veh instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) veh;
            return price == vehicle.price &&
                    phoneNumber == vehicle.phoneNumber  && cal == vehicle.cal && x == vehicle.x && isAvaliable == vehicle.isAvaliable;
        }
        return false;
    }
    public int hashCode(){
        int nums=1;
        int res=5;
        res=nums*res+(int)(phoneNumber);
        res=nums*res+(int)(total);
        res=nums*res+(int) (isAvaliable?1:0);
        res=nums*res+(int)(x);
        res=nums*res+price;
        res=nums*res+(int)cal;
        return res;
    }
}
