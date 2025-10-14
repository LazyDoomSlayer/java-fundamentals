package umcs.lesson02;

/*
 * Exercise 10 — Multiplication Table (1 to 10)
 * --------------------------------------------
 * This program prints a full multiplication table from 1 to 10
 * using nested for loops.
 *
 * Demonstrates:
 *  - nested loops for grid-style output
 *  - formatted printing with printf for alignment
 *  - basic arithmetic in loop iteration
 *
 * Example output:
 *     1   2   3  ...  10
 *     2   4   6  ...  20
 *     ...
 *    10  20  30  ... 100
 */

public class MultiplicationTable {
     static void main(String[] args) {
        System.out.println("Multiplication Table (1–10):\n");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
