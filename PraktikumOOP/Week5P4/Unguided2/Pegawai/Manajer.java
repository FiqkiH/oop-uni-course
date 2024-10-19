package PraktikumOOP.Week5P4.Unguided2.Pegawai;

public class Manajer extends Pegawai {
    private int jumlahProyek;

    public Manajer(String nama, int gajiPokok, double lamaKerja, int jumlahProyek) {
        super(nama, gajiPokok, lamaKerja);
        this.jumlahProyek = jumlahProyek;
    }

    public int getJumlahProyek() {
        return jumlahProyek;
    }

    @Override
    public int hitungBonus() {
        return jumlahProyek*20000;
    }   
}
