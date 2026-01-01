package com.xworkz.wrapper.main;

public class AutoBoxing {
    public static void main(String[] args) {
//        //Auto-Boxing
//        int price=200;
//        Integer value=price;
//        System.out.println(value);
//        long number=45678L;
//        Long num=number;
//        System.out.println(num);
//        double cost=5678.7;
//        Double total=cost;
//        System.out.println(total);
//        float x=23456.324F;
//        Float y=x;
//        System.out.println(y);
//        char code='a';
//        Character c=code;
//        System.out.println(c);
//        boolean isTrue=true;
//        Boolean isAvailable=isTrue;
//        System.out.println(isAvailable);
//        byte q=34;
//        Byte p=q;
//        System.out.println(p);
//        short n=12;
//        Short m=n;
//        System.out.println(m);
//        //boxing
//        Integer z=Integer.valueOf(price);
//        System.out.println(z);

        //Auto-UnBoxing
//        Integer amount=23432;
//        int total=amount;

        //convert int to long,float......
//        Integer price=100;
//        long total=price.longValue();
//        System.out.println(total);
//        float c=price.floatValue();
//        System.out.println(c);

        //Float to long
//        Float num=56789.5678F;
//        long value=num.longValue();
//        Long x=Long.valueOf(value);
//        System.out.println(x);
//        String p=x.toString();

        //String to int,long.....
        String name="true";
        boolean x=Boolean.parseBoolean(name);
        System.out.println(x);
        String address="1324";
        Integer m=Integer.parseInt(address);
        System.out.println(m);
    }
}
