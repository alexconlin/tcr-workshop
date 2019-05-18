package com.kata;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Test
public class FibonacciTest {

    public void given0shouldreturn0() {
        assertThat(Fibonacci.fib(0), is(0));
    }

    public void given1shouldreturn1() {
        assertThat(Fibonacci.fib(1), is(1));
    }

    public void given2shouldreturn1() {
        assertThat(Fibonacci.fib(2), is(1));
    }

    public void given3shouldreturn2() {
        assertThat(Fibonacci.fib(3), is(2));
    }

    public void given4shouldreturn3() {
        assertThat(Fibonacci.fib(4), is(3));
    }

}