package PraktikumOOP.Week10.Guided2;

public class Counter {
    static int count = 0;

    public static void increment() {
        count++;
    }

    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();

        System.out.println(Counter.count);
    }
}