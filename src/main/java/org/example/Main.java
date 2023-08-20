package org.example;

import org.example.fibonacci_dp.FibonacciDP;
import org.example.fibonacci_iterative.FibonacciIterative;
import org.example.fibonacci_recursive.FibonacciRecursive;

public class Main {

    public static void main(String[] args) {

        FibonacciDP fibonacciDP = new FibonacciDP();
        System.out.println(fibonacciDP.fibonacci(10));

        FibonacciRecursive fibonacciRecursive = new FibonacciRecursive();
        System.out.println(fibonacciRecursive.fibonacci(10));

        FibonacciIterative fibonacciIterative = new FibonacciIterative();
        System.out.println(fibonacciIterative.fibonacci(10));

    }
}