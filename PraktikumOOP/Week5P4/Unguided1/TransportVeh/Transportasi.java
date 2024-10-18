package PraktikumOOP.Week5P4.Unguided1.TransportVeh;

public abstract class Transportasi {
    private String nomorKendaraan;
    private int kapasitas;
    private String asalTujuan;
    private double jarak;
    private String kelasLayanan;

    public Transportasi(String nomorKendaraan, int kapasitas, String asalTujuan, double jarak, String kelasLayanan) {
        this.nomorKendaraan = nomorKendaraan;
        this.kapasitas = kapasitas;
        this.asalTujuan = asalTujuan;
        this.jarak = jarak;
        this.kelasLayanan = kelasLayanan;
    }

    public String getNomorKendaraan() {
        return nomorKendaraan;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public String getAsalTujuan() {
        return asalTujuan;
    }

    public double getJarak() {
        return jarak;
    }

    public String getKelasLayanan() {
        return kelasLayanan;
    }

    public abstract double hitungHargaTiket();
}
