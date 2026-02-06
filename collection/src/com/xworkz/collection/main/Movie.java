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

        ArrayList<Character>arrayList=new ArrayList<>();
        arrayList.add('a');
        arrayList.add('A');
        arrayList.add('Y');
        arrayList.add('Z');
        arrayList.add('b');
        arrayList.add('i');
        arrayList.add('c');
        arrayList.add('@');
        arrayList.add('*');
        arrayList.add('_');
        arrayList.add('d');
        arrayList.add('a');
        arrayList.add('w');
        arrayList.add('h');
        arrayList.add('l');

        System.out.println(arrayList.addAll(list));
        System.out.println("Using addALl : "+arrayList);
        System.out.println("Using contains : " + arrayList.contains('c'));
        System.out.println("Using equals : " + list.equals(arrayList));
        System.out.println("Using containsAll : " + list.containsAll(arrayList));
        System.out.println("Using hashcode : " + arrayList.hashCode());
        System.out.println("Using hashcode :"+list.hashCode());
        System.out.println("Using retainsAll : " + list.retainAll(arrayList));
        System.out.println(list);
        System.out.println("Using removeAll : " + list.removeAll(arrayList));
        System.out.println(list);












//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.isEmpty());
//        System.out.println(list.remove(6));
//        System.out.println(list.remove(3));
//        System.out.println(list);
////        list.clear();
////        System.out.println(list);
//        System.out.println("====================");
//        Iterator<Character> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
