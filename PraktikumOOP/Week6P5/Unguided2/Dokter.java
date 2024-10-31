package PraktikumOOP.Week6P5.Unguided2;

import java.util.ArrayList;
import java.util.List;

public class Dokter {
    private String namaDokter;
    private String spesialisasi;
    private List<Jadwal> jadwalHarian = new ArrayList<>();

    public Dokter(String namaDokter, String spesialisasi) {
        this.namaDokter = namaDokter;
        this.spesialisasi = spesialisasi;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }

    public void tambahJadwal(Jadwal jadwal) {
        jadwalHarian.add(jadwal);
    }

    public void cetakInfoPasien() {
        System.out.println("Dokter: " + namaDokter + " (Spesialisasi: " + spesialisasi + ")");
        for (Jadwal jadwal : jadwalHarian) {
            System.out.println("Jadwal Hari: " + jadwal.getHari());
            for (Pasien pasien : jadwal.getDaftarPasien()) {
                System.out.println("- Pasien: " + pasien.getNamaPasien() + ", Nomor Rekam Medis: " + pasien.getNomorRekamMedis());
                System.out.println("  Keluhan: " + pasien.getDaftarKeluhan());
            }
        }
    }
}
