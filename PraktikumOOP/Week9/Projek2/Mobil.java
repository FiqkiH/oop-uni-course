package PraktikumOOP.Week9.Projek2;

// @author Fiqki Haidar Amrulloh 20110005 S1SD-03-01

public class Mobil extends Kendaraan implements Pajak{
    int kapasitasCC;

    public Mobil() {
        super();
        this.kapasitasCC = 0;
    }

    public Mobil (String nomorPlat, String merk, float harga, int kapasitasCC) {
        super(nomorPlat, merk, harga);
        this.kapasitasCC = kapasitasCC;
    }

    public void infoMobil() {
        System.out.println("Kapasitas CC: " + kapasitasCC + " CC");
    }

    @Override
    public float hitungPajak() {
        return harga * 10000 * kapasitasCC / 2000;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoMobil();
        System.out.println("Pajak Mobil: Rp. " + hitungPajak());
    }
}
