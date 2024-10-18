package PraktikumOOP.Week5P4.Unguided1.Main;

import PraktikumOOP.Week5P4.Unguided1.TransportVeh.Transportasi;
import PraktikumOOP.Week5P4.Unguided1.TransportVeh.Pesawat;
import PraktikumOOP.Week5P4.Unguided1.TransportVeh.KapalLaut;
import PraktikumOOP.Week5P4.Unguided1.TransportVeh.Kereta;

import java.util.ArrayList;
import java.util.List;

public class SistemReservasi {
   private List<Transportasi> daftarTransportasi;

   public SistemReservasi() {
        daftarTransportasi = new ArrayList<>();
   }

   public void tambahTransportasi(Transportasi Transportasi) {
        daftarTransportasi.add(Transportasi);
   }

   public void tampilkanSemuaKendaraan() {
        for (Transportasi Transportasi : daftarTransportasi) {
            System.out.println("Jenis Transportasi: "  + Transportasi.getClass().getSimpleName() +
                                "\nRute Perjalanan: " + Transportasi.getAsalTujuan() +
                                "\nHarga Tiket: " + Transportasi.hitungHargaTiket());
            System.out.println();
        }
   }

   public static void main(String[] args) {
        SistemReservasi app = new SistemReservasi();

        Transportasi pesawat1 = new Pesawat("PK-GPH", 162, "Jakarta - Singapore", 1302.8, "VIP", "Garuda Airlines");
        Transportasi kapalLaut1 = new KapalLaut("KPL-354", 1500, "Surabaya - Bima", 921.3, "Bisnis", "KM. KIRANA IX");
        Transportasi kereta1 = new Kereta("KRT-LDY", 106, "Bandung - Yogyakarta", 498.9, "Ekonomi", "Lodaya 92");

        app.tambahTransportasi(pesawat1);
        app.tambahTransportasi(kapalLaut1);
        app.tambahTransportasi(kereta1);

        app.tampilkanSemuaKendaraan();
   }
}

