package org.example.fibonacci;

import org.example.fibonacci_recursive.FibonacciRecursive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciRecursiveTest {
    @Test
    void testFibonacci() {
        //Given

        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        final int n = 33;

        //When

        final long result = fibonacciRecursive.fibonacci(n);

        //Then

        final long expected = 3524578;
        assertEquals(expected, result);

    }

    @Test
    void testZeroInput() {
        //Given

        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        final int n = 0;

        //When

        long result = fibonacciRecursive.fibonacci(n);

        //Then
        final long expected = 0;
        assertEquals(expected, result);
    }
}
