package com.xworkz.name.main;

import com.xworkz.name.external.NameException;

public class Main {
    static String username = "pooja";

    public static void main(String[] args) {
        try {
            run();
        } catch (NameException e) {
            System.out.println(e.getMessage());
        }
    }

    static void run() throws NameException {
        if (username.equals("pooja")) {
            System.out.println("Yes,Username is correct");
        }else{
            throw new NameException("Invalid username");
        }
    }
}
