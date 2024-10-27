package PraktikumOOP.Week6P5.Projek3;

import java.util.ArrayList;
import java.util.List;

public class Buku {
    //atribut
    private String judulBuku;
    private List<Bab> daftarBab;
    
    public Buku(String judulBuku){
        this.judulBuku = judulBuku;
        this.daftarBab = new ArrayList<>();
    }
    
    public void tambahBab(String judulBab) {
        Bab bab = new Bab(judulBab);
        daftarBab.add(bab);
    }
    public void cetakDaftarBab() {
        System.out.println("Daftar Bab dalam buku: " + judulBuku + "\":");
        for (Bab bab : daftarBab) {
            System.out.println("- " + bab.getJudulBab());
        }
    }
    public String getJudulBuku() {
        return judulBuku;
    }
}
