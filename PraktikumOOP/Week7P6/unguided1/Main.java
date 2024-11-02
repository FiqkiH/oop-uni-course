package PraktikumOOP.Week7P6.unguided1;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(14);
        Bola bola1 = new Bola(42);

        System.out.println("Luas lingkaran1: " + lingkaran1.getLuas());
        System.out.println("Luas lingkaran1 jika jarijari 7: " + lingkaran1.getLuas(7));
        System.out.println("Luas bola1 : " + bola1.getLuas());
        System.out.println("Volume bola1 : " + bola1.getVolume());
    }
    
}
