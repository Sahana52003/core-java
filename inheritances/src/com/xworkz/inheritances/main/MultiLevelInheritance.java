package com.xworkz.inheritances.main;

import com.xworkz.inheritances.external.*;
import com.xworkz.inheritances.intern.Music;

public class MultiLevelInheritance {
    public static void main(String[] args) {
    Songs songs=new Songs();
    songs.download();
    songs.favorite();
    songs.lyrics();
    songs.stop();
    songs.record();
    Songs.play();
    Music.pause();
    songs.shuffle();
    songs.volumeUp();
    System.out.println("=======================");
    Tennis tennis=new Tennis();
    tennis.hit();
    tennis.netPlay();
    tennis.serveBall();
    tennis.goal();
    tennis.compete();
    tennis.kick();
    tennis.practice();
    tennis.train();
    tennis.pass();
    System.out.println("=======================");
    Employee employee=new Employee();
    employee.work();
    employee.meeting();
    employee.report();
    employee.assign();
    employee.evaluate();
    employee.plan();
    employee.hire();
    employee.rules();
    employee.event();
    }
}
