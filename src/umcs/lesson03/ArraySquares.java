package umcs.lesson03;

/*
 * Exercise 8 — Squares of Numbers in Array
 * ----------------------------------------
 * This program fills an array with numbers from 1 to 10
 * and prints their squares using a separate method.
 *
 * Demonstrates:
 *  - array initialization with a loop
 *  - method reuse for calculation
 *  - clean console output
 */

public class ArraySquares {
    static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        printSquares(numbers);
    }

    static void printSquares(int[] arr) {
        for (int n : arr) {
            System.out.println(n + "² = " + square(n));
        }
    }

    static int square(int n) {
        return n * n;
    }
}
