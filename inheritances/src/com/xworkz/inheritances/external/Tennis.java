package com.xworkz.inheritances.external;

import com.xworkz.inheritances.intern.Football;

public class Tennis extends Football {
   public void hit() {
        System.out.println("Hit a ball to the opponent");
    }
    public void netPlay() {
        System.out.println("playing near net to control the point");
    }
    public void serveBall() {
        System.out.println("game is started to play again");
    }
}
