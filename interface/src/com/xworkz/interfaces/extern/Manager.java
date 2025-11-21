package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Employee;

public class Manager implements Employee {
    @Override
    public void attendMeeting() {
        System.out.println("Attending meeting to give updates");
    }

    @Override
    public void work() {
        System.out.println("assigned tasks to complete");
    }

    @Override
    public void takeBreak() {
        System.out.println("takes a coffee break");
    }

    @Override
    public void report() {
        System.out.println("upadating a project report");
    }

    @Override
    public void infom() {
        System.out.println("Informing the team about the latest updates");
    }
}
