package PraktikumOOP.Week8P7.Guided1;

public class DemoAbstrak {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        kucing.suara();
        anjing.suara();

        kucing.tidur();
        anjing.tidur();
    }
}
