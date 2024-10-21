package PraktikumOOP.Week5P4.Unguided1.TransportVeh;

public abstract class Transportasi {
    protected String nomorKendaraan;
    protected int kapasitas;
    protected String asalTujuan;
    protected double jarak;
    protected String kelasLayanan;

    public Transportasi(String nomorKendaraan, int kapasitas, String asalTujuan, double jarak, String kelasLayanan) {
        this.nomorKendaraan = nomorKendaraan;
        this.kapasitas = kapasitas;
        this.asalTujuan = asalTujuan;
        this.jarak = jarak;
        this.kelasLayanan = kelasLayanan;
    }

    public String getAsalTujuan() {
        return asalTujuan;
    }

    public abstract double hitungHargaTiket();
}
