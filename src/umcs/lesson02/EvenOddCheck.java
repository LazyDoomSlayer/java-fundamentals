package umcs.lesson02;
import java.util.Scanner;

/*
 * Exercise 2 — Positive/Negative and Even/Odd Checker
 * ---------------------------------------------------
 * This program asks the user to enter a number.
 * It then checks:
 *  - whether the number is positive, negative, or zero
 *  - and if the number is even or odd (except when it’s zero)
 *
 * It demonstrates nested if–else statements and the use of the modulo (%) operator.
 */

public class EvenOddCheck {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("The number is zero.");
            return;
        }

        String sign = number > 0 ? "Positive" : "Negative";
        String parity = (number % 2 == 0) ? "even" : "odd";

        System.out.println(sign + " and " + parity + ".");
    }
}