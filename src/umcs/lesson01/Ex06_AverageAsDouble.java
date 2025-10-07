package umcs.lesson01;

import java.util.Scanner;

// Task Description: Given two integers, compute and print their average as a double. Make sure your program produces a decimal result even if both numbers are integers.

public class Ex06_AverageAsDouble {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("Average: " + average);

        input.close();
    }
}

