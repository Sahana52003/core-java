package com.xworkz.objclass.internal;

public class Customer {
    public byte age;
    public short years;
    public int customerId;
    public long phoneNumber;
    public float discountRate;
    public double accountBalance;
    public char gender;
    public boolean isPremium;

    public Customer(byte age, short years, int customerId, long phoneNumber, float discountRate, double accountBalance, char gender, boolean isPremium) {
        this.age = age;
        this.years = years;
        this.customerId = customerId;
        this.phoneNumber = phoneNumber;
        this.discountRate = discountRate;
        this.accountBalance = accountBalance;
        this.gender = gender;
        this.isPremium = isPremium;
    }

    public String toString() {
        return "Customer{age=" + this.age + ", years=" + this.years + ", customerId=" + this.customerId + ", phoneNumber=" + this.phoneNumber + ", discountRate=" + this.discountRate + ", accountBalance=" + this.accountBalance + ", gender=" + this.gender + ", isPremium=" + this.isPremium + '}';
    }

    public boolean equals(Object cus) {
        if (this == cus) {
            return true;
        } else if (!(cus instanceof Customer)) {
            return false;
        } else {
            Customer customer = (Customer)cus;
            return this.age == customer.age && this.years == customer.years && this.customerId == customer.customerId && this.phoneNumber == customer.phoneNumber && this.discountRate == customer.discountRate && this.accountBalance == customer.accountBalance && this.gender == customer.gender && this.isPremium == customer.isPremium;
        }
    }

    public int hashCode() {
        int cours = 3;
        int result = 12;
        result = 3 * result + this.age;
        result = 3 * result + this.years;
        result = 3 * result + this.customerId;
        result = 3 * result + (int)this.phoneNumber;
        result = 3 * result + (int)this.discountRate;
        result = 3 * result + (int)this.accountBalance;
        result = 3 * result + this.gender;
        result = 3 * result + (this.isPremium ? 1 : 0);
        return result;
    }
}
