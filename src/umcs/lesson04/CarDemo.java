package umcs.lesson04;

/*
 * Lesson 4 — OOP: Class, Constructor, and Objects
 * -----------------------------------------------
 * This program defines a simple Car class with fields and a constructor.
 * It then creates 3 different Car objects and displays their details.
 *
 * Demonstrates:
 *  - defining a class with fields and methods
 *  - using constructors to initialize objects
 *  - creating and using multiple objects
 */

public class CarDemo {
    static void main(String[] args) {
        // Create 3 different Car objects
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("BMW", 2018);
        Car car3 = new Car("Tesla", 2023);

        // Display information for each car
        car1.showInfo();
        car2.showInfo();
        car3.showInfo();
    }
}

// Car class definition
class Car {
    private final String brand;
    private final int year;

    // Constructor initializes both fields
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display information
    public void showInfo() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }
}
