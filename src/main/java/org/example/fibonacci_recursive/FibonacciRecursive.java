package org.example.fibonacci_recursive;

import org.example.Fibonacci;

public class FibonacciRecursive implements Fibonacci {
    @Override
    public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
