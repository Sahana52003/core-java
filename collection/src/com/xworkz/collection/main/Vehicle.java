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

        ArrayList<Boolean>arrayList=new ArrayList<>();
        arrayList.add(true);
        arrayList.add(false);
        arrayList.add(true);
        arrayList.add(true);
        arrayList.add(false);
//        arrayList.add(true);
//        arrayList.add(true);


        //System.out.println(arrayList.addAll(list));
        System.out.println("Using addALl : "+arrayList);
        System.out.println("Using contains : " + arrayList.contains(true));
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
//        System.out.println(list.remove(4));
//        System.out.println(list);
////        list.clear();
////        System.out.println(list);
////        System.out.println(list.isEmpty());
//        System.out.println("====================");
//        Iterator<Boolean> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
