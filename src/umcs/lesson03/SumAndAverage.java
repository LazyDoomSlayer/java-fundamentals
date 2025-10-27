package umcs.lesson03;

/*
 * Exercise 3 — Sum and Average of Array
 * -------------------------------------
 * This program computes and prints the sum and average
 * of numbers stored in an array using a separate method.
 *
 * Demonstrates:
 *  - method definition and invocation
 *  - array iteration
 *  - basic arithmetic with double casting
 */

public class SumAndAverage {
    static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        computeSumAndAverage(numbers);
    }

    static void computeSumAndAverage(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int sum = 0;
        for (int n : arr) sum += n;

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
