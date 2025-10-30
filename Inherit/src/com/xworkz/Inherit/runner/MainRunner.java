package com.xworkz.Inherit.runner;

import com.xworkz.Inherit.external.School;
import com.xworkz.Inherit.internal.University;

public class MainRunner {
    public static void main(String[] args) {
        University uni=new University();
        uni.operate();
        uni.research();
        School sch=new School();
        sch.exam();
        sch.study();
        University university=new School();
        university.research();
        university.operate();
        School school=(School)university;
        school.study();
        school.exam();
    }
}
