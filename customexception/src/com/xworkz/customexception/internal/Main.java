package com.xworkz.customexception.internal;

import com.xworkz.customexception.external.Person;

public class Main {
    static int age = 5;

    public static void main(String[] args) {
        System.out.println("Person ");
        try {
            elegibleForVote();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void elegibleForVote() throws Person {
        if (age < 18) {
            throw new Person("Not Eligible to vote");
        }else {
            System.out.println("eligible to vote");
        }
    }
}