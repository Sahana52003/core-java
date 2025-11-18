package com.xworkz.abstractionn.main;

public abstract class Browser {
    public abstract void openTab();
    public abstract void closeTab();
    public abstract void refresh();
    public abstract void clearHistory();
    public abstract void bookmarkPage();


        public String name;
        public Browser(String name){
            this();
            this.name=name;
            System.out.println("name " + name);
        }

        public Browser(){
            System.out.println("It gives a lot of information");
        }
    public static void downloadFile(){
        System.out.println("downloading the files");
    }

    public void goBack(){
        System.out.println("back to the previous page");
    }

    public void goForward(){
        System.out.println("forward to the next page");
    }
}