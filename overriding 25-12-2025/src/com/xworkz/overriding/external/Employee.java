package com.xworkz.overriding.external;

import com.xworkz.overriding.internal.Manager;

public class Employee extends Manager {
    @Override
    public void work() {
        System.out.println("doing work given by manger to complete it");
    }
    @Override
    public void takeBreak() {
        System.out.println("relax after work");
    }
    @Override
    public void attendMeeting() {
        System.out.println("meeting has scheduled to attend");
    }
    @Override
    public void report() {
        System.out.println("report is submitted to check");
    }
    @Override
    public void leave() {
        System.out.println("time to leave office");
    }
}
