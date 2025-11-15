

package com.xworkz.objclass.internal;

public class Payment {
    public byte paymentType;
    public short taxRate;
    public int paymentId;
    public long transactionNumber;
    public float exchangeRate;
    public double totalAmount;
    public char currencySymbol;
    public boolean isSuccessful;

    public Payment(byte paymentType, short taxRate, int paymentId, long transactionNumber, float exchangeRate, double totalAmount, char currencySymbol, boolean isSuccessful) {
        this.paymentType = paymentType;
        this.taxRate = taxRate;
        this.paymentId = paymentId;
        this.transactionNumber = transactionNumber;
        this.exchangeRate = exchangeRate;
        this.totalAmount = totalAmount;
        this.currencySymbol = currencySymbol;
        this.isSuccessful = isSuccessful;
    }

    public String toString() {
        return "Payment{paymentType=" + this.paymentType + ", taxRate=" + this.taxRate + ", paymentId=" + this.paymentId + ", transactionNumber=" + this.transactionNumber + ", exchangeRate=" + this.exchangeRate + ", totalAmount=" + this.totalAmount + ", currencySymbol=" + this.currencySymbol + ", isSuccessful=" + this.isSuccessful + '}';
    }

    public boolean equals(Object pay) {
        if (this == pay) {
            return true;
        } else if (!(pay instanceof Payment)) {
            return false;
        } else {
            Payment payment = (Payment)pay;
            return this.paymentType == payment.paymentType && this.taxRate == payment.taxRate && this.paymentId == payment.paymentId && this.transactionNumber == payment.transactionNumber && this.exchangeRate == payment.exchangeRate && this.totalAmount == ((Payment)pay).totalAmount && this.currencySymbol == ((Payment)pay).currencySymbol && this.isSuccessful == payment.isSuccessful;
        }
    }

    public int hashCode() {
        int cours = 1;
        int result = 2;
        result = 1 * result + this.paymentType;
        result = 1 * result + this.taxRate;
        result = 1 * result + this.paymentId;
        result = 1 * result + (int)this.transactionNumber;
        result = 1 * result + (int)this.exchangeRate;
        result = 1 * result + (int)this.totalAmount;
        result = 1 * result + this.currencySymbol;
        result = 1 * result + (this.isSuccessful ? 1 : 0);
        return result;
    }
}
