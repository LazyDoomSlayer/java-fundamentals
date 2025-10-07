package umcs.lesson01;

import java.util.Scanner;

// Task Description: Write a Java program that converts a temperature in Celsius to Fahrenheit using the formula. Print both the input temperature in Celsius and the result in Fahrenheit.

public class Ex05_CelsiusToFahrenheit {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

        input.close();
    }
}

