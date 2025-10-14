package umcs.lesson02;

/*
 * Exercise 5 — Print Even Numbers Between 1 and 20 (For Loop)
 * -----------------------------------------------------------
 * This program prints all even numbers between 1 and 20
 * using a for loop.
 *
 * Demonstrates:
 *  - loop iteration with a step increment
 *  - use of modulo (%) operator to check even numbers
 *  - clean, efficient iteration pattern
 */

public class EvenNumbersForLoop {
    static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
