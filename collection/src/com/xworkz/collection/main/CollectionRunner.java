package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionRunner {
    public static void main(String[] args) {
        List<Object>list=new ArrayList<>();
        list.add(2567880L);
        list.add(235.324f);
        list.add(-2365);
        list.add(53D);
        list.add("hello");
        list.add('A');
        list.add(741);
        list.add("4561");
        list.add("true");
        list.add("Hi");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(3));
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println("====================");
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
