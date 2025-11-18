package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.Machine;

public class Nescafe extends Machine {
    @Override
    public void start() {
        System.out.println("started to make caffe");
    }

    @Override
    public void grindBeans() {
        System.out.println("Grinding the beans to powder.");
    }

    @Override
    public void brew() {
        System.out.println("Brewing a coffee.");
    }

    @Override
    public void serveCoffee() {
        System.out.println("Coffee has been served.");
    }

    @Override
    public void stop() {
        System.out.println("After that it will stop");
    }

    @Override
    public void addBeans() {
        System.out.println("coffee beans are mix well ");
    }
}