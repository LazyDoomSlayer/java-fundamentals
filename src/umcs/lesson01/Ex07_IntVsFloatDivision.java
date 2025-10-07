package umcs.lesson01;

// Task Description: Write a short program that demonstrates the difference between integer division and floating-point division (e.g., 5 / 2 vs. 5.0 / 2).

public class Ex07_IntVsFloatDivision {
    static void main(String[] args) {
        int a = 5;
        int b = 2;

        int intResult = a / b;
        double floatResult = (double) a / b;

        System.out.println("Integer division (5 / 2): " + intResult);
        System.out.println("Floating-point division (5.0 / 2): " + floatResult);
    }
}
