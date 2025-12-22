package com.xworkz.inheritances.external;

import com.xworkz.inheritances.intern.Music;

public class Songs extends Music {
   public void lyrics() {
        System.out.println("display with lyrics");
    }
    public void favorite() {
        System.out.println("marking favorite songs");
    }
   public void download() {
        System.out.println("downloads n-number of songs to play");
    }
}
