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
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(4));
        System.out.println(list);

        Iterator<Short> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
