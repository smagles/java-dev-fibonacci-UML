package org.example.fibonacci_iterative;

import org.example.Fibonacci;

public class FibonacciIterative implements Fibonacci {

    @Override
    public long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input n cannot be negative");
        } else if (n <= 1) {
            return n;
        }
        int current = 0;
        int previous1 = 0;
        int previous2 = 1;

        for (int i = 1; i < n; i++) {
            current = previous1 + previous2;
            previous1 = previous2;
            previous2 = current;
        }

        return current;
    }

}
