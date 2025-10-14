package umcs.lesson02;
import java.util.Scanner;

/*
 * Exercise 1 — Positive, Negative, or Zero Checker
 * ------------------------------------------------
 * This program asks the user to enter a number
 * and then checks whether the number is:
 *  - positive
 *  - negative
 *  - or zero.
 *
 * It demonstrates the use of simple conditional (if–else) statements.
 */

public class PositiveNegativeCheck {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
