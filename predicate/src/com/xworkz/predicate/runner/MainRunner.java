package com.xworkz.predicate.runner;

import com.xworkz.predicate.internal.Payment;

import java.util.function.Predicate;

public class MainRunner {
    public static void main(String[] args) {
//        Predicate<Boolean> isPaid=new Predicate<Boolean>() {
//            @Override
//            public boolean test(Boolean isCredited) {
//                System.out.println("Calling this Method" + isCredited);
//                return isCredited!=null&&isCredited;
//            }
//        };
//        boolean resi=isPaid.test(false);
//        System.out.println(resi);
        Payment status=(isCredited )-> {
            System.out.println("Checking status");
            return isCredited;
        };
        boolean result=status.test(true);
        System.out.println(result);
    }
}
