package com.xworkz.inheritances.intern;

import com.xworkz.inheritances.internal.Media;

public class Music extends Media {
 public static void pause() {
     System.out.println("paused to start ");
    }
   public void shuffle() {
     System.out.println("shuffling songs");
    }
    public void volumeUp() {
        System.out.println("increase or decrease a volume");
    }
}
