package com.xworkz.inheritances.external;

import com.xworkz.inheritances.internal.Game;

public class Cricket extends Game {

    public  void levels(){
        System.out.println("It has been moved to next match");
    }
    public void matchOver(){
        System.out.println("match is Over");
    }
    public void toss(){
        System.out.println("team choose head or tail ");
    }
    public void scorRun(){
        System.out.println("Given a scores are");
    }
    public void review(){
        System.out.println("Giving some reviews");
    }
}