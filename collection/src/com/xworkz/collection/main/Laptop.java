package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Laptop {
    public static void main(String[] args) {
        List<Double> list=new ArrayList<>();
        list.add(8374832D);
        list.add(536672D);
        list.add(545263d);
        list.add(2563D);
        list.add(67D);
        list.add(563d);
        list.add(678787787D);
        list.add(2536D);
        list.add(6763D);
        list.add(12d);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(7));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println("====================");
        Iterator<Double> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
