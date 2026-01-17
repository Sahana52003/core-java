package com.xworkz.patterns.main;

public class Main {
    public static void main(String[] args) {
        int n = 4;

        // Upper part
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
