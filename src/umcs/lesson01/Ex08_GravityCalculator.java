package umcs.lesson01;

// Task Description: Modify the Gravity Calculator program to use a different initial velocity (e.g., 5.0) and falling time (e.g., 20.0). Observe how the output changes

public class Ex08_GravityCalculator {
    static void main(String[] args) {
        double gravity = -9.81;
        double time = 10.0;
        double initialVelocity = 5.0;
        double initialPosition = 20.0;

        double finalPosition = 0.5 * gravity * time * time
                + initialVelocity * time
                + initialPosition;

        System.out.println("Object's position after " + time + " seconds: " + finalPosition + " m");
    }
}
