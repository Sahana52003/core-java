package com.xworkz.Inherit.runner;

import com.xworkz.Inherit.external.Novel;
import com.xworkz.Inherit.internal.Book;

public class Runner {
    public static void main(String[] args) {
     Book book=new Book();
     book.close();
     book.open();
     Novel novel=new Novel();
     novel.bookmark();
     novel.read();
     Book book1=new Novel();
     book1.open();
     book1.close();
     Novel novel1=(Novel)book1;
     novel1.bookmark();
     novel1.read();
     novel1.open();
     novel1.close();
    }
}
