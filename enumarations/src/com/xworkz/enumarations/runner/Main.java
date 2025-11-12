package com.xworkz.enumarations.runner;
import com.xworkz.enumarations.file.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Country.AUSTRALIA);
        System.out.println(Country.AUSTRALIA.hashCode());
        System.out.println(Country.AUSTRALIA.toString());
        System.out.println(Country.AUSTRALIA.getCode());
        System.out.println(Country.BELGIUM.hashCode());
        System.out.println(Country.BELGIUM.toString());
        System.out.println(Country.BELGIUM.getCode());
        System.out.println(Country.CHINA.hashCode());
        System.out.println(Country.CHINA.toString());
        System.out.println(Country.CHINA.getCode());
        System.out.println(Country.INDIA.hashCode());
        System.out.println(Country.INDIA.toString());
        System.out.println(Country.INDIA.getCode());
        System.out.println(Country.JAPAN.hashCode());
        System.out.println(Country.JAPAN.toString());
        System.out.println(Country.JAPAN.getCode());
        System.out.println(Country.SOUTH_KOREA.hashCode());
        System.out.println(Country.SOUTH_KOREA.toString());
        System.out.println(Country.SOUTH_KOREA.getCode());
        System.out.println("--------------------------------------");
        States states=States.KARNATAKA;
        System.out.println(States.ANDHRA_PRADESH);
        System.out.println(States.DELHI.toString());
        System.out.println(States.ANDHRA_PRADESH.getCompanies());
        System.out.println(States.ANDHRA_PRADESH.getCity());
        System.out.println(States.MADHYA_PRADESH.getCity());
        System.out.println(States.MADHYA_PRADESH.getCompanies());
        System.out.println(States.GUJARAT.toString());
        System.out.println(States.GUJARAT.getCity());
        System.out.println(States.GUJARAT.getCompanies());
        System.out.println(States.TELANGANA.toString());
        System.out.println(States.TELANGANA.getCity());
        System.out.println(States.TELANGANA.getCompanies());
        System.out.println(States.KERALA.toString());
        System.out.println(States.KERALA.getCity());
        System.out.println(States.KERALA.getCompanies());
        System.out.println(States.TAMIL_NADU.toString());
        System.out.println(States.TAMIL_NADU.getCompanies());
        System.out.println(States.TAMIL_NADU.getCity());
    }
}
