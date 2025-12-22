package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Payment;

public class UPI extends Payment {
    public void scanCode() {
        System.out.println("Scanning QR code to pay");
    }
    public void sendMoney() {
        System.out.println("money is sended");
    }
    public void requestMoney() {
        System.out.println("requesting from user to send money");
    }
    public void enterUPIID() {
        System.out.println("enetring UPID number ");
    }
    public void sendQRCode() {
        System.out.println("can send QR code to receive money");
    }
}
