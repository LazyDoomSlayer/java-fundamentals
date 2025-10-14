package umcs.lesson02;
import java.util.Scanner;

/*
 * Exercise 3 — Month Name with Modern Switch Expression
 * -----------------------------------------------------
 * This program asks the user for a number between 1 and 12
 * and prints the corresponding month name.
 *
 * Demonstrates:
 *  - modern switch expression (Java 14+)
 *  - assignment from switch (Java 21 syntax still valid)
 *  - default case handling
 */

public class MonthNameSwitch {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number (1–12): ");
        int month = scanner.nextInt();

        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number!";
        };

        System.out.println(monthName);
    }
}
