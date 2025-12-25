package com.xworkz.overloading.runner;

import com.xworkz.overloading.internal.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calculate();
        System.out.println( calculator.calculate(3,5));
        calculator.calculate(23,56,12.3f);
        calculator.calculate(78,45,33,45.12);
        calculator.calculate(50,45,1234L,6789L,34,89);
        System.out.println("========================================");
        Printer printer=new Printer();
        printer.print("HelloWorld");
        printer.print(10,"45");
        printer.print("Welcome to India",7,false);
        printer.print("Suzume",15,true,'A');
        printer.print((byte)7,(short)4,2344546L,"A4",34.00,.5F);
        System.out.println("========================================");
        Delivery delivery=new Delivery();
        delivery.deliver(4356789087L);
        delivery.deliver("Bangalore",2);
        delivery.deliver("Online",1200,'A');
        delivery.deliver("Mobiles",(short)12,true,5.5F);
        delivery.deliver("Tumkur",6,false,8.4,'K',600.0F);
        System.out.println("========================================");
        Notification notification=new Notification();
        notification.notify(8);
        notification.notify("Hi",true);
        notification.notify(43567898765L,'G',(byte)5);
        notification.notify((short)3,24324.546F,11.0,false);
        notification.notify("GM",108,75781236L,'T',12.0F,23);
        System.out.println("========================================");
        Vehicle vehicle=new Vehicle();
        vehicle.start((byte)12);
        vehicle.start((short)7,2);
        vehicle.start(324564L,5F,'C');
        vehicle.start(324542,false,(byte)2,(short)4);
        vehicle.start(4,3245765L,100,"Hyundai",'Z',true);
    }
}
