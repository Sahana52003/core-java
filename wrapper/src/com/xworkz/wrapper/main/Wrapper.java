package com.xworkz.wrapper.main;

public class Wrapper {
    public static void main(String[] args) {
//        short num=12;
//        Short value=num;
//        System.out.println(value);
//        short x=value;
//        System.out.println(x);
//        boolean isAvailable=false;
//        Boolean isQuality=isAvailable;
//        System.out.println(isQuality);
//        boolean y=isQuality;
//        System.out.println(y);

        float num=12.67f;
        Float x=num;
        long o=5678l;
        Long r=Long.valueOf(o);
        String c=String.valueOf(r);
        long y=x.longValue();
        String h=String.valueOf(y);
        System.out.println(y);
        System.out.println(x.toString());


        String name="jkt";
        String q="100";
        int cc=Integer.parseInt(q);
        System.out.println(cc);
        boolean l=Boolean.parseBoolean(name);
        System.out.println(l);


    }
}
