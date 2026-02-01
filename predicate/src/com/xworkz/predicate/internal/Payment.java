package com.xworkz.predicate.internal;

@FunctionalInterface
public interface Payment {
    boolean test(Boolean isCredited);
}
