package com.xworkz.exceptions.main;


import java.util.Stack;

public class EmptyStack {
        public static void main(String[] args) { Stack<Integer> stack = new Stack<>();
//            Stack<Integer> stacks = new Stack<>();
//            stacks.pop();
        try {
            Stack<Integer> stacks = new Stack<>();
            stacks.pop();
        } catch (Exception e) {
            System.out.println("empty stack exception");
        } finally {
            System.out.println("Finally block executed");
        }
        }
    }
