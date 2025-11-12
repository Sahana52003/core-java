package com.xworkz.enumarations.runner;
import com.xworkz.enumarations.file.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Country.AFGHANISTAN);
        System.out.println(Country.AFGHANISTAN.hashCode());
        System.out.println(Country.ALBANIA.toString());
        System.out.println(Country.ALBANIA.getCode());
        System.out.println(Country.ALGERIA.hashCode());
        System.out.println(Country.ALGERIA.toString());
        System.out.println(Country.ALGERIA.getCode());
        System.out.println("--------------------------------------");
        States states=States.KARNATAKA;
        System.out.println(States.ANDHRA_PRADESH);
        System.out.println(States.DELHI.toString());
        System.out.println(States.ANDHRA_PRADESH.getCompanies());
        System.out.println(States.ANDHRA_PRADESH.getCity());
        System.out.println(States.MADHYA_PRADESH.getCity());
        System.out.println(States.MADHYA_PRADESH.getCompanies());
        
    }
}
