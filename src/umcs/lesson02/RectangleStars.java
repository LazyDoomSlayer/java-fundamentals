package umcs.lesson02;

import java.util.Scanner;

/*
 * Exercise 9 — Rectangle of Asterisks (Nested Loops)
 * --------------------------------------------------
 * This program prints a simple rectangle made of asterisks (*).
 * The user can choose the number of rows and columns.
 *
 * Example (rows = 3, cols = 4):
 * ****
 * ****
 * ****
 *
 * Demonstrates:
 *  - nested for loops
 *  - user-defined dimensions
 *  - clean console formatting
 */

public class RectangleStars {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Both values must be positive integers.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
