package umcs.lesson03;

/*
 * Exercise 4 — Check if Number is Even
 * ------------------------------------
 * This program defines a method isEven(int n) that returns true
 * if a given number is even, and false otherwise.
 *
 * Demonstrates:
 *  - method returning boolean
 *  - modulus operator (%)
 *  - simple logical condition
 */

public class IsEvenChecker {
    static void main(String[] args) {
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
