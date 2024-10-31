package PraktikumOOP.Week6P5.Unguided2;

import java.util.ArrayList;
import java.util.List;

public class Jadwal {
    private String hari;
    private List<Pasien> daftarPasien = new ArrayList<>();

    public Jadwal(String hari) {
        this.hari = hari;
    }

    public String getHari() {
        return hari;
    }

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}