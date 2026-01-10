package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Byte> list=new ArrayList<>();
        list.add((byte) 2);
        list.add((byte) 3);
        System.out.println(list.add((byte) 8));
        list.add((byte) 3);
        list.add((byte)122);
        list.add((byte)12);
        list.add((byte)127);
        list.add((byte)128);
        list.add((byte)85);
        list.add((byte)55);
        list.add((byte)88);
        list.add((byte)77);
        list.add((byte)3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(7));
        System.out.println(list);

        Iterator<Byte> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
