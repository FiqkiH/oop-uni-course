package TeoriOOP.W10.Projek3;

public class CounterMachine {
    private static int counter = 0;

    public static void count() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
