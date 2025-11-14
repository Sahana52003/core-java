package com.xworkz.abstractionn.name;

import com.xworkz.abstractionn.main.ATM;

public  class  Bank extends ATM {
      public   void insertCard() {
            System.out.println("Inserted a  card into the ATM Machine.");
        }

      public   void enterPin() {
            System.out.println("Entered a 4 digit number.");
        }

       public void selectTransaction() {
            System.out.println("Select transaction either cash ");
        }

       public void processTransaction() {
            System.out.println("Ready to withdraw the amount");
        }

       public void accountStatus() {
            System.out.println("shwoing status of amt balance");
        }
}