package com.xworkz.encapsuation.runner;

public class ATM {
    private int pinnumber;
    private double balance;

    public ATM(int pinnumber, double balance) {
        this.pinnumber = pinnumber;
        this.balance = balance;
    }

    public void setPinnumber(int pinnumber) {
        this.pinnumber = pinnumber;
    }

    public int getPinnumber() {
        return pinnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
//        ATM atm = new ATM();
//        atm.setPinnumber(7826);
//        System.out.println(atm.getPinnumber());
//        atm.setBalance(500);
//        System.out.println(atm.getBalance());
        ATM atm1=new ATM(1230,600);
        System.out.println(atm1.getPinnumber());
        System.out.println(atm1.getBalance());
    }
}
