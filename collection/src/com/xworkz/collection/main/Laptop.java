package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Laptop {
    public static void main(String[] args) {
        List<Double> list=new ArrayList<>();
        list.add(8374832D);
        list.add(536672D);
        list.add(545263d);
        list.add(2563D);
        list.add(67D);
        list.add(563d);
        list.add(678787787D);
        list.add(2536D);
        list.add(6763D);
        list.add(12d);
        ArrayList<Double> arrayList=new ArrayList<>();
//        arrayList.add(8374832D);
//        arrayList.add(536672D);
//        arrayList.add(545263d);
//        arrayList.add(2563D);
        arrayList.add(67D);
        arrayList.add(563d);
        arrayList.add(678787787D);
        arrayList.add(2536D);
        arrayList.add(6763D);
        arrayList.add(12d);
        arrayList.add(6721D);
        arrayList.add(8925D);
        System.out.println("Laptop data");
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
//        System.out.println(list.remove(7));
//        System.out.println(list);
////        list.clear();
////        System.out.println(list);
//        System.out.println("====================");
//        Iterator<Double> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
