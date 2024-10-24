package PraktikumOOP.Week6P5.Projek2;

public class Main {
    public static void main(String[] args) {
        KelasSekolah kelas = new KelasSekolah("10 A");
        Siswa siswa1 =  new Siswa("Budi");
        Siswa siswa2 =  new Siswa("Siti");
        Siswa siswa3 =  new Siswa("Andi");

        kelas.addSiswa(siswa1);
        kelas.addSiswa(siswa2);
        kelas.addSiswa(siswa3);

        System.out.println("Kelas: " + kelas.getNamaKelas());
        kelas.cetakSiswa();

    }
}
