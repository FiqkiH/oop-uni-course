package PraktikumOOP.Week5P4.Unguided2.Pegawai;

public class Programmer extends Pegawai {
    private int jumlahProyek;

    public Programmer(String nama, int gajiPokok, double lamaKerja, int jumlahProyek) {
        super(nama, gajiPokok, lamaKerja);
        this.jumlahProyek = jumlahProyek;
    }

    public int getJumlahProyek() {
        return jumlahProyek;
    }

    @Override
    public int hitungBonus() {
        return jumlahProyek*10000;
    }
}
