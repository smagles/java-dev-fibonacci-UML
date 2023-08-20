package org.example.fibonacci;

import org.example.fibonacci_iterative.FibonacciIterative;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class FibonacciIterativeTest {
    @Test
    void testFibonacci() {
        //Given

        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        final int n = 3;

        //When

        final long result = fibonacciIterative.fibonacci(n);

        //Then

        final long expected = 2;
        assertEquals(expected, result);

    }

    @Test
    void testZeroInput() {
        //Given

        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        final int n = 0;

        //When

        long result = fibonacciIterative.fibonacci(n);

        //Then
        final long expected = 0;
        assertEquals(expected, result);
    }

    @Test
    void testNegativeInput() {
        //Given

        FibonacciIterative fibonacciIterative = new FibonacciIterative();

        //When & Then

        assertThrows(IllegalArgumentException.class, () -> fibonacciIterative.fibonacci(-1));
    }
}
