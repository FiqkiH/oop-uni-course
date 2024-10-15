package PraktikumOOP.Week5P4.Projek1.main;
import PraktikumOOP.Week5P4.Projek1.produk.Makanan;
import PraktikumOOP.Week5P4.Projek1.produk.Minuman;


public class AplikasiUtama {
    public static void main(String[] args) {
        Makanan makanan1 = new Makanan("Nasi Goreng", 25000);
        Makanan makanan2 = new Makanan("Sate Ayam", 30000);

        Minuman minuman1 = new Minuman("Teh Manis", 5000);
        Minuman minuman2 = new Minuman("Es Jeruk", 7000);

        System.out.println("Menu Makanan: ");
        System.out.println(makanan1.getNama() + " - Rp. " + makanan1.getHarga());
        System.out.println(makanan2.getNama() + " - Rp. " + makanan2.getHarga());
        
        System.out.println("Menu Minuman: ");
        System.out.println(minuman1.getNama() + " - Rp. " + minuman1.getHarga());
        System.out.println(minuman2.getNama() + " - Rp. " + minuman2.getHarga());
    }    
}
