package com.xworkz.anonymous.Runner;

import com.xworkz.anonymous.internal.Bank;

public class AnonymousRunner {
    public static void main(String[] args) {
//        Bank bank=new Bank() {
//            @Override
//            public void deposit() {
//                System.out.println("Amount is deposited in account");
//            }
//
////            @Override
////            public void withdrawAmount() {
////                System.out.println("Withdraw an amount");
////            }
//        };
//        bank.deposit();
//       // bank.withdrawAmount();
//    }


// Lambda Expression
        Bank bank = () -> {
            System.out.println("States the current Balance");
        };
        bank.checkBalance();

        Bank bank1 = () -> {
            System.out.println("States the current Balance");
        };
        bank1.checkBalance();
    }
}



//Lambda Expression
//        Bank bank = () -> true;
//        Bank bank1=()->false;
//        Boolean aBoolean= bank.checkBalance();
//        System.out.println(aBoolean);
//        Boolean ab=bank1.checkBalance();
//        System.out.println(ab);
//    }
//
//
//}
