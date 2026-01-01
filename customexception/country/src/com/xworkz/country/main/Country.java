package com.xworkz.country.main;

import com.xworkz.country.external.CheckException;

public class Country {
    static String country = "USA";

    public static void main(String[] args) {
        try {
            run();
        } catch (CheckException e) {
            System.out.println(e.getMessage());
        }
    }

    static void run() throws CheckException {
        if (country.equals("India")) {
            throw new CheckException("Country matched");
        }else{
            System.out.println("Check once");
        }
    }
}
