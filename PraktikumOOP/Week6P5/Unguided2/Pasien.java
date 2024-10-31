package PraktikumOOP.Week6P5.Unguided2;

import java.util.ArrayList;
import java.util.List;

public class Pasien {
    private String namaPasien;
    private String nomorRekamMedis;
    private List<String> daftarKeluhan = new ArrayList<>();

    public Pasien(String namaPasien, String nomorRekamMedis) {
        this.namaPasien = namaPasien;
        this.nomorRekamMedis = nomorRekamMedis;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public void tambahKeluhan(String keluhan) {
        daftarKeluhan.add(keluhan);
    }

    public List<String> getDaftarKeluhan() {
        return daftarKeluhan;
    }
}