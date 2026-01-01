package com.xworkz.temperature.main;

import com.xworkz.temperature.external.AmmuException;

public class Main {
    static int temp = 5;

    public static void main(String[] args) {
        System.out.println("Check Temperature status");
        try {
            checkTemp();
        } catch (AmmuException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkTemp() throws AmmuException {
        if (temp < 10) {
            throw new AmmuException("Low temperature");
        }else{
            System.out.println("High temperature");
        }
    }
}
