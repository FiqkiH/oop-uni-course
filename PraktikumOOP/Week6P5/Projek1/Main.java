package PraktikumOOP.Week6P5.Projek1;

public class Main {
    public static void main(String[] args) {
        Penulis penulis1 = new Penulis("J.K Rowling");
        Penulis penulis2 = new Penulis("Tolken");

        Buku buku1 = new Buku("Harry Potter");
        Buku buku2 = new Buku("Lord of the Rings");

        penulis1.tambahBuku(buku1);
        penulis2.tambahBuku(buku2);

        buku1.tambahPenulis(penulis1);
        buku2.tambahPenulis(penulis2);

        System.out.println("Penulis: " + penulis1.getNamaPenulis());
        System.out.println("Judul Buku: " + buku1.getJudulBuku());

        System.out.println("Penulis: " + penulis2.getNamaPenulis());
        System.out.println("Judul Buku: " + buku2.getJudulBuku());
    }
    
}
