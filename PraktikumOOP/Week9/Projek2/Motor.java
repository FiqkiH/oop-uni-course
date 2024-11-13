package PraktikumOOP.Week9.Projek2;

// @author Fiqki Haidar Amrulloh 20110005 S1SD-03-01

public class Motor extends Kendaraan implements Pajak{
    String jenisMotor;
    int kapasitasCC;

    public Motor() {
        super();
        this.jenisMotor = "Data Kosong";
        this.kapasitasCC = 0;
    }

    public Motor (String nomorPlat, String merk, float harga, String jenisMotor, int kapasitasCC) {
        super(nomorPlat, merk, harga);
        this.jenisMotor = jenisMotor;
        this.kapasitasCC = kapasitasCC;
    }

    public void infoMotor() {
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Kapasitas CC: " + kapasitasCC + " CC");
    }

    @Override
    public float hitungPajak() {
        return harga * 10000 * kapasitasCC / 100;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        infoMotor();
        System.out.println("Pajak Motor: Rp. " + hitungPajak());
    }
}
