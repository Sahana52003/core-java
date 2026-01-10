package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TV {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("658273");
        list.add("Universe");
        list.add("total");
        list.add("programmer");
        list.add("HTML");
        list.add("Colors");
        list.add("Remote");
        list.add("Solution");
        list.add("Train1");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(4));
        System.out.println(list.size());
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println("====================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
