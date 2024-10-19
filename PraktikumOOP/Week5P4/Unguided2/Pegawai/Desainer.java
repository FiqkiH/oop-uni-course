package PraktikumOOP.Week5P4.Unguided2.Pegawai;

public class Desainer extends Pegawai{
    private int jumlahDesain;

    public Desainer(String nama, int gajiPokok, double lamaKerja, int jumlahDesain) {
        super(nama, gajiPokok, lamaKerja);
        this.jumlahDesain = jumlahDesain;
    }

    public int getJumlahDesain() {
        return jumlahDesain;
    }

    @Override
    public int hitungBonus() {
        return jumlahDesain*5000;
    }
}
