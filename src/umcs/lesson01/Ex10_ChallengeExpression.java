package umcs.lesson01;

// Task Description: Write a program that computes the result of the following expression and prints it: ( (3 + 4) × 5 ) / 2. Then modify the program to use variables a, b, c, and d for each number.

public class Ex10_ChallengeExpression {
    static void main(String[] args) {
        double result = (5 + 3) * 2 / (4.0 - 1) + Math.pow(2, 3);

        System.out.println("Result of the expression: " + result);
    }
}
