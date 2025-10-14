package umcs.lesson02;

import java.util.Scanner;
import java.math.BigInteger;

/*
 * Exercise 6 — Factorial Calculation (For Loop)
 * ---------------------------------------------
 * This program asks the user to enter a positive integer
 * and calculates its factorial using a for loop.
 *
 * Example:
 *   Input: 5
 *   Output: 5! = 120
 *
 * Demonstrates:
 *  - iterative multiplication using for loop
 *  - user input handling via Scanner
 *  - long type for large factorial results
 */

public class FactorialBigInteger {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(n + "! = " + factorial);
    }
}
