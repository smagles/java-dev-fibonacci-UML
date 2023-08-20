package org.example.fibonacci;

import org.example.fibonacci_dp.FibonacciDP;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciDPTest {
    @Test
    void testFibonacci() {
        //Given

        FibonacciDP fibonacciDP = new FibonacciDP();
        final int n = 10;

        //When

        final long result = fibonacciDP.fibonacci(n);

        //Then

        final long expected = 55;
        assertEquals(expected, result);

    }

    @Test
    void testZeroInput() {
        //Given


        FibonacciDP fibonacciDP = new FibonacciDP();
        final int n = 0;

        //When

        long result = fibonacciDP.fibonacci(n);

        //Then
        final long expected = 0;
        assertEquals(expected, result);
    }
}
