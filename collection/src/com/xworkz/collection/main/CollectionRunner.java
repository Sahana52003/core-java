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
       ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(2567880L);
        arrayList.add(235.324f);
        arrayList.add(-2365);
        arrayList.add(53D);
        arrayList.add("hello");
        arrayList.add('A');
        arrayList.add(741);
       arrayList.add(5678);
       arrayList.add("Universe");
       arrayList.add(233.2);
        System.out.println(arrayList.addAll(list));
        System.out.println("Using addALl : "+arrayList);
        System.out.println("Using contains : " + arrayList.contains(56789.23F));
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
//        System.out.println(list.remove(3));
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.isEmpty());
//        System.out.println("====================");
//        Iterator<Object> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
