package com.xworkz.abstractionn.name;


import com.xworkz.abstractionn.main.Browser;

public class Chrome extends Browser {
    @Override
    public void openTab() {
        System.out.println("Opend  a new tab or prevous ");
    }

    @Override
    public void closeTab() {
        System.out.println("can close the tab");
    }

    @Override
    public void refresh() {
        System.out.println("Page is refreshed ");
    }

    @Override
    public void clearHistory() {
        System.out.println("deleting a unnecessary sites");
    }

    @Override
    public void bookmarkPage() {
        System.out.println("make bookmark of Imp site ");
    }


    @Override
    public void goForward() {
        System.out.println("can forwarded to next page or anther nxt page");
    }
}