package PraktikumOOP.Week3P2;

public class ArrayContoh {
    public static void main(String[] args) {
        // Array satu dimensi
        int[] nilai = {80, 90, 75, 85, 95};

        System.out.println("Nilai siswa pertama: " + nilai[0]);
        System.out.println("Nilai siswa kedua: " + nilai[1]);

        // Array dua dimensi
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elemen pada baris 2 kolom 3: " + matrix[1][2]);
    }
}
