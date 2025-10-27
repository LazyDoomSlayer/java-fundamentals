package umcs.lesson03;

/*
 * Exercise 6 — Reverse Array
 * --------------------------
 * This program defines a method reverseArray(int[] arr)
 * that prints all elements of an array in reverse order.
 *
 * Demonstrates:
 *  - reverse iteration using a for loop
 *  - index-based array access
 *  - method usage for modularity
 */

public class ReverseArray {
    static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        reverseArray(numbers);
    }

    static void reverseArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
