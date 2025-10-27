package umcs.lesson04;

/*
 * Exercise 4 — Rectangle
 * -----------------------
 * Defines a Rectangle class with methods to calculate area and perimeter.
 */

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}
