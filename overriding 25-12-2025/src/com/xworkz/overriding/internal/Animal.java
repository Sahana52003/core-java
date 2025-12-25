package com.xworkz.overriding.internal;

public class Animal {
    public void eat() {
        System.out.println("eating thir food");
    }
    public void sleep() {
        System.out.println("sleep in ");
    }
    public void sound() {
        System.out.println("differnt animals makes sounds");
    }
    public void move() {
        System.out.println("moving to next place to sleep");
    }
    public void hunt(String name) {
        System.out.println("Secretely hunt " + name);
    }
}
