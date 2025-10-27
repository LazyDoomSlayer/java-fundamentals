package umcs.lesson03;

/*
 * Exercise 2 — Find Largest Number in Array
 * -----------------------------------------
 * This program finds and prints the largest number in a given array.
 *
 * Demonstrates:
 *  - array traversal
 *  - conditional comparison
 *  - tracking maximum value
 */

public class LargestInArray {
    static void main(String[] args) {
        int[] numbers = {5, 12, 8, 20, 7};

        if (numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
        }

        System.out.println("Largest number: " + max);
    }
}
