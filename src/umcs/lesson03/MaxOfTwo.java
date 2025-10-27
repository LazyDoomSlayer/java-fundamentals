package umcs.lesson03;

/*
 * Exercise 7 — Maximum of Two Numbers
 * -----------------------------------
 * This program defines a method max(int a, int b) that returns
 * the larger of two integers.
 *
 * Demonstrates:
 *  - method with return value
 *  - conditional expression (ternary operator)
 *  - clean and concise logic
 */

public class MaxOfTwo {
    static void main(String[] args) {
        System.out.println("Max of (10, 20): " + max(10, 20));
        System.out.println("Max of (7, 3): " + max(7, 3));
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
