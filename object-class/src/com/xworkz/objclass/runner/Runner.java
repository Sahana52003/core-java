

package com.xworkz.objclass.runner;

import com.xworkz.objclass.internal.*;

public class Runner {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Tiger", 10, (double)220.5F, true, 'M');
        Animal animal2 = new Animal("Tiger", 10, (double)220.5F, true, 'M');
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
        System.out.println("-------------------------------------------------------------------");
        Fan fan1 = new Fan("Havells", 5, 1299.99, true, 1212.3F);
        Fan fan2 = new Fan("Havells", 5, 1299.99, true, 12342.3F);
        System.out.println(fan1.equals(fan2));
        System.out.println(fan1.hashCode());
        System.out.println(fan2.hashCode());
        System.out.println("----------------------------------------------------------------------");
        Pen pen1 = new Pen("black", 15, (double)12.5F, true, 234.32243F);
        Pen pen2 = new Pen("black", 15, (double)12.5F, true, 234.32243F);
        System.out.println(pen1.equals(pen2));
        System.out.println(pen1.hashCode());
        System.out.println(pen2.hashCode());
        System.out.println("------------------------------------------------------------------------");
        Chair chair1 = new Chair("Wood", 4, 1.2, false, 987654321L);
        Chair chair2 = new Chair("Plastic", 3, (double)1.0F, true, 123456789L);
        System.out.println(chair1.equals(chair2));
        System.out.println(chair1.hashCode());
        System.out.println(chair2.height);
        System.out.println("--------------------------------------------------------------------------------");
        Robo robo1 = new Robo("R2D2", 3, (double)85.5F, true, 'A');
        Robo robo2 = new Robo("R2D2", 3, (double)85.5F, true, 'A');
        System.out.println(robo1.equals(robo2));
        System.out.println(robo1.hashCode());
        System.out.println(robo2.hashCode());
    }
}
