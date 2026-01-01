package com.xworkz.checkstatus.main;

import com.xworkz.checkstatus.external.StatusException;

public class StatusCheck {
    static String status = "FAILED";

    public static void main(String[] args) {
        try {
            run();
        } catch (StatusException e) {
            System.out.println(e.getMessage());
        }
    }

    static void run() throws StatusException {
        if (status.equals("FAILED")) {
            throw new StatusException("Operation failed");
        }else{
            System.out.println("Success");
        }
    }
}
