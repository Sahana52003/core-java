package com.xworkz.patterns.main;


import java.util.Random;

public class Pigeonhole {
    public static void main(String[] args) {
        int numPigeons = 10; // number of pigeons
        int numPigeonholes = 9; // number of pigeonholes

        // Initialize pigeonholes
        int[] pigeonholes = new int[numPigeonholes];

        // Randomly distribute pigeons into pigeonholes
        Random random = new Random();
        for (int i = 0; i < numPigeons; i++) {
            int pigeonholeIndex = random.nextInt(numPigeonholes);
            pigeonholes[pigeonholeIndex]++;
        }

        // Print pigeonhole distribution
        System.out.println("Pigeonhole Distribution:");
        for (int i = 0; i < numPigeonholes; i++) {
            System.out.println("Pigeonhole " + (i + 1) + ": " + pigeonholes[i] + " pigeons");
        }

        // Check if at least one pigeonhole has more than one pigeon
        boolean hasMultiplePigeons = false;
        for (int i = 0; i < numPigeonholes; i++) {
            if (pigeonholes[i] > 1) {
                hasMultiplePigeons = true;
                break;
            }
        }

        if (hasMultiplePigeons) {
            System.out.println("Pigeonhole Principle Verified: At least one pigeonhole has more than one pigeon.");
        } else {
            System.out.println("Pigeonhole Principle Not Verified: No pigeonhole has more than one pigeon.");
        }
    }
}