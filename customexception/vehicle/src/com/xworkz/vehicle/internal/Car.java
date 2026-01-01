package com.xworkz.vehicle.internal;

import com.xworkz.vehicle.external.SoraException;

public class Car {
    static int price=30000;

    public static void main(String[] args) {
        System.out.println("About vehicle");
        try{
            start();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void start() throws SoraException{
        if (price!=10000){
            System.out.println("Correct price had given");
        }else {
            throw new SoraException("Not given price ");
        }
    }
}
