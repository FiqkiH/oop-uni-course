package PraktikumOOP.Week5P4.Unguided2.Main;

import PraktikumOOP.Week5P4.Unguided2.Pegawai.Pegawai;
import PraktikumOOP.Week5P4.Unguided2.Pegawai.Programmer;
import PraktikumOOP.Week5P4.Unguided2.Pegawai.Desainer;
import PraktikumOOP.Week5P4.Unguided2.Pegawai.Manajer;

import java.util.ArrayList;
import java.util.List;

public class Perusahaan {
   private List<Pegawai> daftarPegawai;

   public Perusahaan() {
        daftarPegawai = new ArrayList<>();
   }

   public void tambahPegawai(Pegawai Pegawai) {
        daftarPegawai.add(Pegawai);
   }

   public void tampilkanSemuaPegawai() {
        for (Pegawai Pegawai : daftarPegawai) {
            System.out.println("Nama Pegawai: " + Pegawai.getNama() +
                                "\nJenis Pegawai: "  + Pegawai.getClass().getSimpleName() +
                                "\nGaji Pokok: Rp. " + Pegawai.getGajiPokok() +
                                "\nLama Kerja: " + Pegawai.getLamaKerja() + " tahun" +
                                "\nBonus Tambahan: " + Pegawai.hitungBonus());
            System.out.println();
        }
   }

   public static void main(String[] args) {
        Perusahaan app = new Perusahaan();

        Pegawai programmer1 = new Programmer("Ghilman", 7500000, 2.5, 18);
        Pegawai desainer1 = new Desainer("Kezia", 10000000, 2, 54);
        Pegawai manajer1 = new Manajer("Diah", 15000000, 4, 5);

        app.tambahPegawai(programmer1);
        app.tambahPegawai(desainer1);
        app.tambahPegawai(manajer1);

        app.tampilkanSemuaPegawai();
   }
}
