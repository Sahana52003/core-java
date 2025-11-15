package com.xworkz.objclass.internal;

public class Book {
    public String title;
    public double price;
    public int pages;
    public float x;
    public boolean isAvailable;

    public Book() {
        System.out.println("Publishing book");
    }

    public Book(String title, double price, int pages, float x, boolean isAvailable) {
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.x = x;
        this.isAvailable = isAvailable;
    }

    public String toString() {
        return "Book{bookname" + this.title + "have a cost " + this.price + "number of pages " + this.pages + "then number " + this.x + "isbook is avalible in the libraary" + this.isAvailable + "}";
    }

    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        } else if (!(ob instanceof Book)) {
            return false;
        } else {
            Book book = (Book)ob;
            return this.title.equals(book.title) && this.price == book.price && this.pages == book.pages && this.x == book.x && this.isAvailable == book.isAvailable;
        }
    }

    public int hashCode() {
        int value = 5;
        int res = 6;
        res = 5 * res + this.title.hashCode();
        res = 5 * res + (int)this.price;
        res = 5 * res + this.pages;
        res = 5 * res + (this.isAvailable ? 1 : 0);
        res = 5 * res + (int)this.x;
        return res;
    }
}
