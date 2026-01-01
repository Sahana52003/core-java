package com.xworkz.exception.two;

import com.xworkz.city.external.KarthikException;

public class City {
    static String city = "Bangalore";

    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void run() throws KarthikException {
        if (city.equals("Bangalore")) {
            throw new KarthikException("Staying in this city");
        }
    }
}
