package com.xworkz.overloading.internal;

public class Notification {
    public void notify(int noOfMessages) {
        System.out.println("nUmber of messages sent :" + noOfMessages);
    }
    public void notify(String textMessage, boolean isUrgent) {
        System.out.println("message sent is : " + textMessage + " is Important to deliver : " + isUrgent);
    }
    public void notify(long mobileNumber, char messageType, byte size) {
        System.out.println("mobile number sent is :" + mobileNumber +
                " type odf message is : " + messageType +
                " size is " + size);
    }
    public void notify(short code, float values, double chargeAmount, boolean isSent) {
        System.out.println("value is : " + code +
                " message size : " + values +
                " amt : " + chargeAmount +
                " is message is delivered : " + isSent);
    }
    public void notify(String title, int id, long contactNo,
                char category, float duration, double cost) {
        System.out.println("Title of message is : " + title +
                " their's id is : " + id +
                " contact number is : " + contactNo +
                " their category is : " + category +
                " message sent duration is : " + duration +
                " sended amt is : " + cost);
    }
}
