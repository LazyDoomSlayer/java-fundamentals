package umcs.lesson01;

// Task Description: Create a program that concatenates three strings (for example, your first name,middle name, and last name) and prints the full name.

public class Ex09_ConcatFullName {
    static void main(String[] args) {
        String firstName = "Jon";
        String lastName = "Doe";

        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
    }
}
