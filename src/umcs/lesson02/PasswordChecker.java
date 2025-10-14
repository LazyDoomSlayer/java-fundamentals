package umcs.lesson02;

import java.util.Scanner;

/*
 * Exercise 8 — Password Checker Loop
 * ----------------------------------
 * This program repeatedly asks the user to enter a password
 * until they type the correct one.
 *
 * Demonstrates:
 *  - do-while loop (executes at least once)
 *  - String comparison with equals()
 *  - clean loop termination using a boolean condition
 */

public class PasswordChecker {
     static void main(String[] args) {
        final String PASSWORD = "java123";
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter password: ");
            input = scanner.nextLine();

            if (!input.equals(PASSWORD)) {
                System.out.println("Incorrect password. Try again!");
            }

        } while (!input.equals(PASSWORD));

        System.out.println("--- Access granted! ---");
    }
}
