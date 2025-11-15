
package com.xworkz.objclass.runner;

import com.xworkz.objclass.internal.*;

public class Object {
    public static void main(String[] args) {
        Customer customer1 = new Customer((byte)25, (short)3, 101, 9876543210L, 5.5F, (double)12000.75F, 'M', true);
        Customer customer2 = new Customer((byte)25, (short)3, 101, 9876543210L, 5.5F, (double)12000.75F, 'M', true);
        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.hashCode());
        System.out.println(customer2.hashCode());
        Course course1 = new Course((byte)4, (short)12, 501, 10000L, 342564.8F, 249.99, 'A', true);
        Course course2 = new Course((byte)5, (short)10, 502, 8000L, 345.23F, 1234.2345, 'C', false);
        System.out.println("========================");
        System.out.println(course1.equals(course2));
        System.out.println(course1.hashCode());
        System.out.println(course2.hashCode());
        Payment payment1 = new Payment((byte)1, (short)5, 9001, 8888888888L, 456789.22F, (double)500.5F, '$', true);
        Payment payment2 = new Payment((byte)1, (short)5, 9001, 8888888888L, 456789.22F, (double)500.5F, '$', true);
        System.out.println("========================");
        System.out.println(payment1.equals(payment2));
        System.out.println(payment1.hashCode());
        System.out.println(payment2.hashCode());
    }
}
