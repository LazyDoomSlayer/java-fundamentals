package umcs.lesson03;

/*
 * Exercise 9 — Recursive Factorial
 * --------------------------------
 * This program defines a recursive method factorial(int n)
 * that calculates and returns the factorial of a number.
 *
 * Example:
 *   5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * Demonstrates:
 *  - recursion
 *  - base case and recursive step
 *  - input validation with early return
 */

public class RecursiveFactorial {
    static void main(String[] args) {
        int number = 5;
        System.out.println(number + "! = " + factorial(number));
    }

    static long factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }

        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }
}
