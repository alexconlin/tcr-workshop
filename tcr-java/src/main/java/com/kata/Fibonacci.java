package com.kata;

public class Fibonacci {

    public static int fib(int input) {


        if (input < 2) {
            return input;
        }
        return fib(input-1) + fib(input-2);
    }

}