package com.xworkz.abstractionn.abstracts;

import com.xworkz.abstractionn.main.ATM;

public abstract class BankingDevice extends ATM {
    public static boolean isSecure = true;

    public abstract void connect(String bankName);
}
