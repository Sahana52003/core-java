package com.xworkz.blocks.main;

public class Bus extends Car {
      static int value;
        static {
            System.out.println("Static block");
        }

//        {
//            value = 6789;
//            System.out.println(value);
//        }
            Bus(){
            value=23;
                System.out.println("value"+value);
            }
    public void stop(){
        System.out.println("stopped");
    }

        public static void main(String[] args) {

            System.out.println("Main method");
            Bus bus=new Bus();
            Bus bus1=new Bus();
            bus.stop();
        }
    {
        System.out.println("non-static block");
    }
    }
