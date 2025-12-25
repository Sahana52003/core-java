package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.TicketBooking;

public class MovieBooking extends TicketBooking {
    @Override
    public void bookTicket(String name) {
        System.out.println("booking ticket to watch movie : " + name);
    }
    @Override
    public void cancelTicket() {
        System.out.println("Unable to book ticket because all seats are taken");
    }
    @Override
    public void checkAvailability() {
        System.out.println("checking if there is or not ");
    }
    @Override
    public void makePayment(double cost) {
        System.out.println("payment is made through online : " + cost);
    }
    @Override
    public void printTicket() {
        System.out.println("ticket confirmed");
    }
}
