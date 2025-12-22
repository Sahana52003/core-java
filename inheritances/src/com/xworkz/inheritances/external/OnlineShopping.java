package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Shopping;

public class OnlineShopping extends Shopping {
    public void applyCoupon() {
        System.out.println("applied coupon code to get discount");
    }
    public void trackOrder() {
        System.out.println("tracking order");
    }
    public void address() {
        System.out.println("giving address to deliver");
    }
    public void schedule() {
        System.out.println("scheduling items to deliver");
    }
    public void details() {
        System.out.println("details are saved ");
    }
}