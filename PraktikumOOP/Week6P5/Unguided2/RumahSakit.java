package PraktikumOOP.Week6P5.Unguided2;

import java.util.ArrayList;
import java.util.List;

public class RumahSakit {
    private String namaRumahSakit;
    private List<Dokter> daftarDokter = new ArrayList<>();

    public RumahSakit(String namaRumahSakit) {
        this.namaRumahSakit = namaRumahSakit;
    }

    public void tambahDokter(Dokter dokter) {
        daftarDokter.add(dokter);
    }

    public void hapusSemuaDokter() {
        daftarDokter.clear();
    }

    public void cetakInfoRumahSakit() {
        System.out.println("Rumah Sakit: " + namaRumahSakit);
        for (Dokter dokter : daftarDokter) {
            dokter.cetakInfoPasien();
            System.out.println();
        }
    }
}
