package umcs.lesson04;

/*
 * Exercise 7 — Book (Challenge)
 * ------------------------------
 * A simple class with a method to check if a book is "long" (>300 pages).
 */

public class Book {
    private final String title;
    private final int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public Book(String title) {
        this.title = title;
        this.pages = 4;
    }

    static void main(String[] args) {
        Book b1 = new Book("Short Stories", 120);
        Book b2 = new Book("Epic Novel", 540);
        Book b3 = new Book("Lord of the Rings");

        System.out.println(b1.title + " is long? " + b1.isLong());
        System.out.println(b2.title + " is long? " + b2.isLong());
        System.out.println(b3.title + " is long? " + b3.isLong());
    }

    public boolean isLong() {
        return pages > 300;
    }
}
