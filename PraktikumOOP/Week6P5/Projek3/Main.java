package PraktikumOOP.Week6P5.Projek3;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku ("Panduan Belajar Java");
        
        buku1.tambahBab("Bab 1: Pengenalan Java");
        buku1.tambahBab("Bab 2: Variabel");
        buku1.tambahBab("Bab 3: Tipe Data");
        
        buku1.cetakDaftarBab();
        
        buku1 = null;
        
        System.out.println("\n Buku Dihapus. Semua Bab juga dihapus");
    }
}
