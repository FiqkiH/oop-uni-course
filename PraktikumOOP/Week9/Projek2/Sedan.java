package PraktikumOOP.Week9.Projek2;

// @author Fiqki Haidar Amrulloh 20110005 S1SD-03-01

public class Sedan extends Mobil{
    String tipePenggunaan;

    public Sedan() {
        super();
        this.tipePenggunaan = "Data Kosong";
    }

    public Sedan(String nomorPlat, String merk, float harga, int kapasitasCC, String tipePenggunaan) {
        super(nomorPlat, merk, harga, kapasitasCC);
        this.tipePenggunaan = tipePenggunaan;
    }

    public void infoSedan() {
        System.out.println("Tipe Penggunaan: " + tipePenggunaan);
    }

    @Override
    public float hitungPajak() {
        float pajakMobil = super.hitungPajak();
        if (tipePenggunaan.equals("Pribadi")) {
            return pajakMobil + (pajakMobil * 0.2f);
        } else if (tipePenggunaan.equals("Komersial")) {
            return pajakMobil + (pajakMobil * 0.3f);
        } else {
            return 0;
        }
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoSedan();
        System.out.println("Pajak sedan: Rp. " + hitungPajak());
    }
    
}
