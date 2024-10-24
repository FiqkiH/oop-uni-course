package PraktikumOOP.Week6P5.Projek1;

import java.util.List;
import java.util.ArrayList;

public class Buku {
    private String judulBuku;
    private List<Penulis> daftarPenulis;

    public Buku(String judulBuku) {
        this.judulBuku = judulBuku;
        this.daftarPenulis = new ArrayList<>();
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public List<Penulis> getDaftarPenulis() {
        return daftarPenulis;
    }

    public void tambahPenulis(Penulis penulis) {
        daftarPenulis.add(penulis);
    }
}
