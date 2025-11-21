package com.xworkz.interfaces.extern;

import com.xworkz.interfaces.intern.Document;

public class PDF implements Document {
    @Override
    public void compress() {
        System.out.println("compress the word file to pdf");
    }

    @Override
    public void addPage() {
        System.out.println("can add a new page");
    }

    @Override
    public void deletePage() {
        System.out.println("delete a page from this document");
    }

    @Override
    public void highlightText() {
        System.out.println("text has selected to highlight ");
    }

    @Override
    public void rename() {
        System.out.println("rename doc to pdf");
    }
}
