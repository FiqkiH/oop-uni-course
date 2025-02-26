package PraktikumOOP.Week6P5.Projek2;

import java.util.List;
import java.util.ArrayList;

public class KelasSekolah {
    public String namaKelas;
    public ArrayList<Siswa> daftarSiswa;

    public KelasSekolah(String namaKelas) {
        this.namaKelas = namaKelas;
        this.daftarSiswa = new ArrayList<>();
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public List<Siswa> getDaftarSiswa() {
        return daftarSiswa;
    }

    public void cetakSiswa() {
        System.out.println("Kelas: " + namaKelas);
        System.out.println("Siswa: ");
        for (Siswa siswa : daftarSiswa) {
            System.out.println(siswa.getNamaSiswa());
        }
    }

    public void addSiswa(Siswa siswa) {
        daftarSiswa.add(siswa);
    }
}
