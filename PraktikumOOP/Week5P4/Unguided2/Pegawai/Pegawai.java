package PraktikumOOP.Week5P4.Unguided2.Pegawai;

public abstract class Pegawai {
    private String nama;
    private int gajiPokok;
    private double lamaKerja; //dalam satuan tahun

    public Pegawai(String nama, int gajiPokok, double lamaKerja) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.lamaKerja = lamaKerja; 
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public double getLamaKerja() {
        return lamaKerja;
    }

    public abstract int hitungBonus();
    
}
