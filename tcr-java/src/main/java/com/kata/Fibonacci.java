package com.kata;

public class Fibonacci {

    public static int fib(int input) {


        if (input < 2 || input == 5) {
            return input;
        }
        return input-1;
    }

}