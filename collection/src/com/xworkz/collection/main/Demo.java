package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Long> list=new ArrayList<>();
        list.add(2567880L);
        list.add(403456L);
        list.add(102341L);
        list.add(3456750L);
        list.add(765432L);
        list.add(456788L);
        list.add(773245677L);
        list.add(432454L);
        list.add(4567645L);
        list.add(345690L);
        ArrayList<Long>arrayList=new ArrayList<>();
        arrayList.add(2567880L);
        arrayList.add(403456L);
        arrayList.add(102341L);
        arrayList.add(3456750L);
        arrayList.add(765432L);
        arrayList.add(456788L);
//        arrayList.add(773245677L);
//        arrayList.add(432454L);
//        arrayList.add(4567645L);
//        arrayList.add(345690L);
        arrayList.add(6745556L);
        arrayList.add(5678261L);

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
//        System.out.println(list.remove(6));
//        System.out.println(list.remove(3));
//        System.out.println(list.remove(5));
//        System.out.println(list);
////        list.clear();
////        System.out.println(list);
//        System.out.println("====================");
//        Iterator<Long> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
