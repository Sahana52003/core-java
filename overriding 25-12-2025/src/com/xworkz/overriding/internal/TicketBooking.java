package com.xworkz.overriding.internal;

public class TicketBooking {
    public void bookTicket(String name) {
        System.out.println("booking ticket to go : " +name);
    }
    public void cancelTicket() {
        System.out.println("cancelled ticket");
    }

    public void checkAvailability() {
        System.out.println("is ticket is available or not");
    }

    public void makePayment(double cost) {
        System.out.println("Making payment like online or offline payment: " + cost );
    }

    public void printTicket() {
        System.out.println("after that ,ticket is printed");
    }
}
