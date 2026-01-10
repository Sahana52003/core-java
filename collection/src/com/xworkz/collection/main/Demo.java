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
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(6));
        System.out.println(list.remove(3));
        System.out.println(list.remove(5));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println("====================");
        Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
