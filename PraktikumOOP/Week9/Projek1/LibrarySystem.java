package PraktikumOOP.Week9.Projek1;

// @author Fiqki Haidar Amrulloh 20110005

import java.util.Scanner;
import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Media> mediaList = new ArrayList<>();

        // Menambahkan objek Book dan DVD ke daftar media
        mediaList.add(new Book("Java Programming", "John Doe", 2020, 300));
        mediaList.add(new DVD("Java Tutorial", "Jane Smith", 2021, 120));

        System.out.println("=== Daftar Media Tersedia ===");
        for (int i = 0; i < mediaList.size(); i++) {
            System.out.println((i + 1) + ". ");
            mediaList.get(i).displayInfo();
            System.out.println();
        }

        System.out.print("Masukkan nomor media yang ingin dipinjam: ");
        int choice = scanner.nextInt();

        if (choice > 0 && choice <= mediaList.size()) {
            Media selectedMedia = mediaList.get(choice - 1);
            selectedMedia.borrow();

            if (selectedMedia instanceof Reservable) {
                System.out.print("Apakah Anda ingin mereservasi media ini? (y/n): ");
                char reserveChoice = scanner.next().charAt(0);
                if (reserveChoice == 'y' || reserveChoice == 'Y') {
                    ((Reservable) selectedMedia).reserve();
                }
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
