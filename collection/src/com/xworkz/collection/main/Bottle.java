package com.xworkz.collection.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bottle {
    public static void main(String[] args) {
        List<Float> list=new ArrayList<>();
        list.add(72324.6732F);
        list.add(234F);
        list.add(62781.3f);
        list.add(45678.132f);
        list.add(89651.12F);
        list.add(828.123F);
        list.add(678.12435678F);
        list.add(456.232F);
        list.add(67342387.1234567F);
        list.add(234.1223f);
        list.add(453.1F);
        list.add(433.F);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(8));
        System.out.println(list.remove(2));
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println("====================");
        Iterator<Float> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
