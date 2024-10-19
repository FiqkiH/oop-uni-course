package PraktikumOOP.Week5P4.Unguided2.Pegawai;

public class Manajer extends Pegawai {
    private int jumlahTim;

    public Manajer(String nama, int gajiPokok, double lamaKerja, int jumlahTim) {
        super(nama, gajiPokok, lamaKerja);
        this.jumlahTim = jumlahTim;
    }

    public int getJumlahTim() {
        return jumlahTim;
    }

    @Override
    public int hitungBonus() {
        return jumlahTim*20000;
    }   
}
