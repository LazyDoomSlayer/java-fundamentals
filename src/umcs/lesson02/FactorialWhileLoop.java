package umcs.lesson02;

import java.util.Scanner;
import java.math.BigInteger;

/*
 * Exercise 7 — Factorial Calculation (While Loop, BigInteger)
 * -----------------------------------------------------------
 * This program asks the user to enter a non-negative integer
 * and calculates its factorial using a while loop.
 *
 * Uses:
 *  - BigInteger for arbitrary-precision integer arithmetic
 *  - Early returns for clear control flow
 *
 * Notes:
 *  - Factorials grow extremely fast; runtime and memory will increase with n.
 *  - Input is limited to int range for practicality, but results have no upper bound.
 */

public class FactorialWhileLoop {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            return;
        }

        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        BigInteger factorial = BigInteger.ONE;
        int i = 2;

        while (i <= n) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++;
        }

        System.out.println(n + "! = " + factorial);
    }
}
