package com.xworkz.exceptions.main;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBound {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.get(3);
        try {
            List<Integer> list = new ArrayList<>();
            list.get(3);
        }catch (Exception e){
            System.out.println("Index out of exception");
        }try{
            List<Integer> list = new ArrayList<>();
            list.get(-1);
        }catch (Exception e){
            System.out.println("index box");
        }finally{
            System.out.println("final block executed");
        }
    }
}
