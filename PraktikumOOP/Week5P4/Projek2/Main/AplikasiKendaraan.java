package PraktikumOOP.Week5P4.Projek2.Main;

import PraktikumOOP.Week5P4.Projek2.Kendaraan.Kendaraan;
import PraktikumOOP.Week5P4.Projek2.Kendaraan.Mobil;
import PraktikumOOP.Week5P4.Projek2.Kendaraan.Motor;

import java.util.ArrayList;
import java.util.List;

public class AplikasiKendaraan {
   private List<Kendaraan> daftarKendaraan;

   public AplikasiKendaraan() {
        daftarKendaraan = new ArrayList<>();
   }

   public void tambahKendaraan(Kendaraan Kendaraan) {
        daftarKendaraan.add(Kendaraan);
   }

   public void tampilkanSemuaKendaraan() {
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.tampilkanInfo();
            kendaraan.bergerak();
            System.out.println();
        }
   }

   public static void main(String[] args) {
        AplikasiKendaraan app = new AplikasiKendaraan();

        Kendaraan mobil1 = new Mobil("Toyota", "Hilux", 4);
        Kendaraan motor1 = new Motor("Honda", "CBR", true);

        app.tambahKendaraan(mobil1);
        app.tambahKendaraan(motor1);

        app.tampilkanSemuaKendaraan();
   }
}
