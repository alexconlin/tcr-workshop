package com.kata;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Test
public class FibonacciShould {

    public void assert0() {
        assertThat(Fibonacci.fib(0), is(0));
    }
}