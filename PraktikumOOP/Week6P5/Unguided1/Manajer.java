package PraktikumOOP.Week6P5.Unguided1;

import java.util.List;
import java.util.ArrayList;

public class Manajer {
    private String namaManajer;
    private List<Proyek> daftarProyek = new ArrayList<>();

    public Manajer(String namaManajer) {
        this.namaManajer = namaManajer;
    }

    public void tambahProyek(Proyek proyek) {
        daftarProyek.add(proyek);
    }

    public void hapusProyek(Proyek proyek) {
        proyek.hapusTugas();
        daftarProyek.remove(proyek);
    }

    public void tampilkanStatusManajemenProyek() {
        System.out.println("Manajer Proyek: " + namaManajer);
        System.out.println("Daftar Proyek yang Dikelola:");
        for (Proyek proyek : daftarProyek) {
            proyek.tampilkanStatusProyek();
            System.out.println();
        }
    }
}
