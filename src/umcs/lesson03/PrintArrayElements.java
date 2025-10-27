package umcs.lesson03;

/*
 * Exercise 1 — Print Array Elements
 * ---------------------------------
 * This program creates an array of 5 integers and prints all its elements.
 *
 * Demonstrates:
 *  - array declaration and initialization
 *  - enhanced for loop
 *  - simple iteration through array elements
 */

public class PrintArrayElements {
    static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
