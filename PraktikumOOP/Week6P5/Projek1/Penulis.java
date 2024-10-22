package PraktikumOOP.Week6P5.Projek1;

import java.util.List;
import java.util.ArrayList;


public class Penulis {
    private String namaPenulis;
    private List<Buku> daftarBuku;

    public Penulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
        this.daftarBuku = new ArrayList<>();
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public List<Buku> getDaftarBuku(){
        return daftarBuku;
    }
    
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }
}
