package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Movie {
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('a');
        list.add('A');
        list.add('Y');
        list.add('Z');
        list.add('b');
        list.add('i');
        list.add('c');
        list.add('@');
        list.add('*');
        list.add('_');
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(6));
        System.out.println(list.remove(3));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println("====================");
        Iterator<Character> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
