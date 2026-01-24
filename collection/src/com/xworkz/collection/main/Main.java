package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Short> list=new ArrayList<>();
        list.add((short) 232);
        list.add((short) 453);
        System.out.println(list.add((short) 348));
        list.add((short) 31);
        list.add((short)672);
        list.add((short)612);
        list.add((short)2227);
        list.add((short)728);
        list.add((short)845);
        list.add((short)515);
        list.add((short)878);
        list.add((short)777);
        list.add((short)123);

        ArrayList<Short>arrayList=new ArrayList<>();
        arrayList.add((short) 232);
        arrayList.add((short) 453);
        System.out.println(arrayList.add((short) 348));
        arrayList.add((short) 31);
        arrayList.add((short)672);
        arrayList.add((short)612);
        arrayList.add((short)2227);
        arrayList.add((short)728);
        arrayList.add((short)845);
        arrayList.add((short)515);
        arrayList.add((short)878);
        arrayList.add((short)777);
        arrayList.add((short)123);
//        arrayList.add((short)5678);
//        arrayList.add((short)58987);

       // System.out.println(arrayList.addAll(list));
        System.out.println("Using addALl : "+arrayList);
        System.out.println("Using contains : " + arrayList.contains((short)728));
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
//
//        Iterator<Short> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
