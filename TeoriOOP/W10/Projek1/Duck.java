package TeoriOOP.W10.Projek1;

public class Duck {
    private int size;
    private int duckCount = 0;

    public Duck(int size) {
        this.size = size;
        duckCount++;
    }

    public int getSize() {
        return size;
    }

    public int getCount() {
        return duckCount;
    }
}
