package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("eating food");
    }
    @Override
    public void sleep() {
        System.out.println("slepping");
    }
    @Override
    public void sound() {
        System.out.println("makes sound");
    }
    @Override
    public void move() {
        System.out.println("move from place to other place to live");
    }
    @Override
    public void hunt(String name) {
        System.out.println("hunting other animal to eat : " + name);
    }
}
