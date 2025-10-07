package umcs.lesson01;

// Task Description: Create a program that computes and prints the sum, difference, product, and quotient of two numbers (for example, 12 and 5).

public class Ex04_ArithmeticOperations {
    static void main(String[] args) {
        int a = 12;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

