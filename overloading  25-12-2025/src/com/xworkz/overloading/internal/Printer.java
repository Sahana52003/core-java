package com.xworkz.overloading.internal;

public class Printer {
    public void print(String message){
        System.out.println("Printing some important files : " + message);
    }
    public void print(int cost,String copies){
        System.out.println("The number copies are : " + copies + " and the total cost is : " + cost);
    }
    public void print(String message, int number, boolean isPrinted){
        System.out.println("Is the copies are printed : " + isPrinted +
                "Then total pages are : " + number + "the information are :" + message);
    }
    public void print(String message, int copies, boolean isColor, char paperSize){
        System.out.println("The print maded is color or black&white: " + isColor + "and paper size is :" + paperSize
        + "copies are : " + copies + "messages : " + message);
    }
    public void print(byte size, short letters, long id, String paperSize,
                      double totalAmount,float onePaperCost){
        System.out.println("The size is : " + size + " and the letters in papaer are : " + letters
                + "and isd is : " + id + "The papersize is : " + paperSize + "Total amount is : " + totalAmount +
                ",But one paper cost is : " + onePaperCost);
    }
}
