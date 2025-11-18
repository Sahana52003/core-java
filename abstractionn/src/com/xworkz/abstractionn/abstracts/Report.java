package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.Printer;

public abstract class Report extends Printer {
    public static float number = 78.9f;
    public abstract void printReport(String reportName);
}
