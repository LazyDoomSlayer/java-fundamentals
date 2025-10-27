package umcs.lesson03;

import java.util.Scanner;

/*
 * Exercise 10 — Palindrome Checker
 * --------------------------------
 * This program checks whether a given word is a palindrome.
 * A palindrome reads the same forward and backward
 * (e.g., "level", "madam", "racecar").
 *
 * Demonstrates:
 *  - string manipulation
 *  - character comparison
 *  - use of Scanner for user input
 */

public class PalindromeChecker {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }
    }

    static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) return false;

        text = text.toLowerCase();
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
