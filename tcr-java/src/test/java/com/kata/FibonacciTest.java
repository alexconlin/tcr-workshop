package com.kata;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Test
public class FibonacciTest {

    public void given0ShouldReturn0() {
        assertThat(Fibonacci.fib(0), is(0));
    }

    public void given1ShouldReturn1() {
        assertThat(Fibonacci.fib(1), is(1));
    }

    public void given2ShouldReturn1() {
        assertThat(Fibonacci.fib(2), is(1));
    }

    public void given3ShouldReturn2() {
        assertThat(Fibonacci.fib(3), is(2));
    }

    public void given4ShouldReturn3() {
        assertThat(Fibonacci.fib(4), is(3));
    }

    public void given5ShouldReturn5() {
        assertThat(Fibonacci.fib(5), is(5));
    }

}