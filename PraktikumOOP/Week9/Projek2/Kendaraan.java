package PraktikumOOP.Week9.Projek2;

// @author Fiqki Haidar Amrulloh 20110005 S1SD-03-01

public class Kendaraan {
    String nomorPlat, merk;
    float harga;

    public Kendaraan() {
        this.nomorPlat = "Data Kosong";
        this.merk = "Data Kosong";
        this.harga = 0;
    }

    public Kendaraan(String nomorPlat, String merk, float harga) {
        this.nomorPlat = nomorPlat;
        this.merk = merk;
        this.harga = harga;
    }

    public void tampilInfo() {
        System.out.println("Nomor Plat: " + nomorPlat);
        System.out.println("Merk: " + merk);
        System.out.println("Harga: " + harga + " juta");
    }
}
