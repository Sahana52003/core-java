package com.xworkz.inheritances.main;

import com.xworkz.inheritances.external.Company;
import com.xworkz.inheritances.external.*;



public class SingleInheritance {
    public static void main(String[] args) {
        Cricket cricket=new Cricket();
        cricket.score();
        cricket.pause();
       cricket.start();
        cricket.play();
        cricket.toss();
        cricket.matchOver();
        cricket.levels();
        cricket.review();
        cricket.scorRun();
        cricket.stop();
        System.out.println("=========================");
        Company company=new Company();
        company.work();
        company.attendMeeting();
        company.receiveSalary();
        company.applyLeave();
        company.followRules();
        company.register();
        company.hireEmployees();
        company.payTaxes();
        company.provideInfrastructure();
        company.generateRevenue();
        System.out.println("=========================");
        Mobile mobile=new Mobile();
        mobile.powerOn();
        mobile.powerOff();
        mobile.charge();
        mobile.connectToNetwork();
        mobile.checkBattery();
        mobile.call();
        mobile.installApp();
        mobile.browseInternet();
        mobile.takePhoto();
        mobile.sendMessage();
    }
}
