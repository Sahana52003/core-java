package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Person;

public class Student implements Person {
    @Override
    public void walk() {
        System.out.println("He is going to college");
    }

    @Override
    public void talk() {
        System.out.println("Talks with others");
    }

    @Override
    public void study() {
        System.out.println("Preparing for exam to get a good marks");
    }

    @Override
    public void work() {
        System.out.println("Completing class homework");
    }

    @Override
    public void eat() {
        System.out.println("He is eating ");
    }
}
