package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Camera;

import java.util.Calendar;

public abstract class Device extends Camera {
    public static char deviceGrade = 'A';
    public abstract void startCapture(String fileName);
}
