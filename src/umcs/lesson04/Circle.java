package umcs.lesson04;

/*
 * Exercise 8 — Circle (Challenge)
 * -------------------------------
 * Demonstrates use of Math constants and formulas.
 * area = πr²
 * circumference = 2πr
 */

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.printf("Area: %.2f%n", c.area());
        System.out.printf("Circumference: %.2f%n", c.circumference());
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}
