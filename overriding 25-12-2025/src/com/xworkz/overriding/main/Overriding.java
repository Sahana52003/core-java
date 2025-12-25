package com.xworkz.overriding.main;

import com.xworkz.overriding.external.*;

public class Overriding {
    public static void main(String[] args) {
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.start();
        smartPhone.stop();
        smartPhone.reset();
        smartPhone.move();
        smartPhone.install();
        System.out.println("===================================");
        CoffeeMachine coffeeMachine=new CoffeeMachine();
        coffeeMachine.turnOn();
        coffeeMachine.turnOff();
        coffeeMachine.operate();
        coffeeMachine.clean();
        coffeeMachine.repair();
        System.out.println("===================================");
        Employee employee=new Employee();
        employee.work();
        employee.takeBreak();
        employee.attendMeeting();
        employee.report();
        employee.leave();
        System.out.println("===================================");
        Cat cat=new Cat();
        cat.sleep();
        cat.move();
        cat.eat();
        cat.sound();
        cat.hunt("rat");
        System.out.println("===================================");
        MovieBooking movieBooking=new MovieBooking();
        movieBooking.bookTicket("Bahubali");
        movieBooking.cancelTicket();
        movieBooking.checkAvailability();
        movieBooking.makePayment(800);
        movieBooking.printTicket();
    }
}
