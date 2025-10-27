package umcs.lesson04;

/*
 * Exercise 6 — Counter
 * ---------------------
 * Demonstrates encapsulation: value is private and modified only through methods.
 */

public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    static void main(String[] args) {
        Counter counter = new Counter(10);
        counter.increment();
        counter.increment();
        counter.decrement();
        System.out.println("Current counter value: " + counter.getValue());
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }
}
