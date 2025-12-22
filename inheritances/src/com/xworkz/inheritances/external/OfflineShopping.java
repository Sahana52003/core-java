package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Shopping;

public class OfflineShopping extends Shopping {
    public void checkOffers() {
        System.out.println("checking bill to get offer/discount");
    }
    public void askAssistance() {
        System.out.println("getting help from assistance to show new items");
    }
    public void tryProducts() {
        System.out.println("trail before buying a product");
    }
    public void homeDelivery() {
        System.out.println("provides homedelivery");
    }
    public void getBill() {
        System.out.println("billing for all items ");
    }
}
