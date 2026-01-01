package com.xworkz.exceptions.main;

public class Arithmetic {
    public static void main(String[] args) {
//        int x = 10;
//        int y = 0;
//        int result = x / y;
//        System.out.println(result);
//        try {
//            int result = x / y;
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println("can't divide by zero");
//        }finally{
//        System.out.println("may executed ");
//    }
//    }
//}

//        try {
//            int number = 35 / 0;
//        } catch (Exception e) {
//          System.out.println("value : " + e.getMessage());
//           e.printStackTrace();
//        }
//    }
//}

//        try {
//            int value = 45 / 0;
//            System.out.println("Message");
//        } catch (ArithmeticException ae) {
//            System.out.println("arithmeticexception executed");
//        }catch (Exception e){
//            System.out.println("Exception");
//        }
//    }
//}
//
        String name=null;
        try {
            try {
            name.charAt(0);
            } catch (NullPointerException e) {
                System.out.println("Null pointer Exception =="+e.getMessage());
            }
            } catch (Exception e) {
            System.out.println("Exception");
            }
        }
    }