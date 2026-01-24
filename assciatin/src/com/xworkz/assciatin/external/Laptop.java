package com.xworkz.assciatin.external;//package com.xworkz.assciatin.external;

import com.xworkz.assciatin.internal.Chrome;

public class Laptop {
   static Chrome chrome;

    public Laptop(Chrome chrome){
        this.chrome=chrome;
    }

    public void open(){
       String x= chrome.start();
        System.out.println(x);
    }

    public static void main(String[] args) {
//        String x= chrome.start();
//        System.out.println(x);
        Chrome chrome=new Chrome("Youtube");
        Laptop laptop=new Laptop(chrome);
        laptop.open();

    }
}





//
//enum Latop {
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
//}
//
//class Test {
//    public static void main(String[] args) {
//        Latop d = Latop.THURSDAY.MONDAY;
//        System.out.println(d);
//    }
//}

