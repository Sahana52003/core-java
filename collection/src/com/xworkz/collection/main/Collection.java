package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(2);
        list.add(8);
        list.add(77);
        list.add(44);
        list.add(45);
        list.add(90);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(6));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        for (Integer total:list) {
            System.out.println(total);
        }
        System.out.println("====================");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}