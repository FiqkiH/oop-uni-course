package PraktikumOOP.Week3P2;

public class Operator {
    public static void main(String[] args) {
        // Operator aritmatika
        int a = 10;
        int b = 5;
        int hasilPenjumlahan = a + b;
        int hasilPengurangan = a - b;
        int hasilPerkalian = a * b;
        int hasilPembagian = a / b;

        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Operator relasional
        boolean lebihBesar = a > b;
        boolean samaDengan = a == b;

        System.out.println("Apakah a lebih besar dari b? " + lebihBesar);
        System.out.println("Apakah a sama dengan b? " + samaDengan);

        // Operator kondisional
        boolean hasilKondisi = (a > 5) && (b < 10);
        System.out.println("Apakah a lebih besar dari 5 dan b kurang dari 10? " + hasilKondisi);
    }
}
