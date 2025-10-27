package umcs.lesson03;

/*
 * Exercise 5 — Count Even Numbers in Array
 * ----------------------------------------
 * This program counts how many even numbers are present in an array.
 * It reuses the isEven(int n) method for cleaner and modular logic.
 *
 * Demonstrates:
 *  - method reuse
 *  - array traversal
 *  - counting with a simple loop
 */

public class CountEvenNumbers {
    static void main(String[] args) {
        int[] numbers = {2, 5, 8, 11, 14, 17};
        int evenCount = countEvens(numbers);

        System.out.println("Number of even elements: " + evenCount);
    }

    static int countEvens(int[] arr) {
        int count = 0;
        for (int n : arr) {
            if (isEven(n)) count++;
        }
        return count;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
