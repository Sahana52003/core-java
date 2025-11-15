

package com.xworkz.objclass.internal;

public class Ticket {
    public String passengerName;
    public int ticketNumber;
    public double price;
    public boolean isConfirmed;
    public char seatCategory;

    public Ticket() {
        System.out.println("created ticket");
    }

    public Ticket(String passengerName, int ticketNumber, double price, boolean isConfirmed, char seatCategory) {
        this.passengerName = passengerName;
        this.ticketNumber = ticketNumber;
        this.price = price;
        this.isConfirmed = isConfirmed;
        this.seatCategory = seatCategory;
    }

    public String toString() {
        return "Ticket{passenger booking Name" + this.passengerName + " ,his/her number " + this.ticketNumber + " and booked price is " + this.price + "is seat is booked" + this.isConfirmed + "having a category" + this.seatCategory + "}";
    }

    public boolean equals(Object tick) {
        if (this == tick) {
            return true;
        } else if (!(tick instanceof Ticket)) {
            return false;
        } else {
            Ticket ticket = (Ticket)tick;
            return this.passengerName.equals(ticket.passengerName) && this.ticketNumber == ticket.ticketNumber && this.price == ticket.price && this.isConfirmed == ticket.isConfirmed && this.seatCategory == ticket.seatCategory;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.passengerName.hashCode();
        res = 5 * res + this.ticketNumber;
        res = 5 * res + (int)this.price;
        res = 5 * res + (this.isConfirmed ? 1 : 0);
        res = 5 * res + this.seatCategory;
        return res;
    }
}
