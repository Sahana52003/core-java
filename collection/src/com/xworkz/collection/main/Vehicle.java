package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vehicle {
    public static void main(String[] args) {
        List<Boolean> list=new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(true);
        list.add(false);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(4));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.isEmpty());
        System.out.println("====================");
        Iterator<Boolean> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
