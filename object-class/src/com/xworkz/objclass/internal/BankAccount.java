package com.xworkz.objclass.internal;

public class BankAccount {
    public java.lang.String accountHolderName;
    public long accountNumber;
    public double balance;
    public boolean isActive;
    public char accountType;

    public BankAccount() {

    }

    public BankAccount(String accountHolderName, long accountNumber, double balance, boolean isActive, char accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.isActive = isActive;
        this.accountType = accountType;
    }

    public java.lang.String toString() {
        return "account{holdername=" + this.accountHolderName + ", accnumber=" + this.accountNumber + ", balance in account=" + this.balance +
                ", Activated=" + this.isActive + ", type of Account=" + this.accountType + "}";

    }

    public boolean equals(Object account) {
        if (this == account) {
            return true;
        } else if (!(account instanceof BankAccount)) {
            return false;
        } else {
            BankAccount bank = (BankAccount) account;
            return this.accountNumber == bank.accountNumber && this.balance == bank.balance && this.isActive == bank.isActive &&
                    this.accountType == bank.accountType && this.accountHolderName.equals(bank.accountHolderName);
        }
    }

    public int hashCode() {
        int ani = 1;
        int result = 4;
        result = 1 * result + this.accountHolderName.hashCode();
        result = 1 * result + (int)accountNumber;
        result = 1 * result + (int)this.balance;
        result = 1 * result + this.accountType;
        result = 1 * result + (this.isActive ? 1 : 0);
        return result;
    }
}