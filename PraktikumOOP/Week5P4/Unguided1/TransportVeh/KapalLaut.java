package PraktikumOOP.Week5P4.Unguided1.TransportVeh;

public class KapalLaut extends Transportasi{
    private String namaKapal;

    public KapalLaut(String nomorKendaraan, int kapasitas, String asalTujuan, double jarak, String kelasLayanan, String namaKapal) {
        super(nomorKendaraan, kapasitas, asalTujuan, jarak, kelasLayanan);
        this.namaKapal = namaKapal;
    }

    public String getNamaKapal() {
        return namaKapal;
    }

    @Override
    public double hitungHargaTiket() {
        if (getJarak() <= 0) {
            System.out.println("Nilai Jarak Invalid");
            return -1;
        }
        //set threshold jarak 100km, 200km, 300km
        switch (getKelasLayanan()) {
            case "Ekonomi":
                if (getJarak() <= 100) {
                    return 500000;
                } else if (getJarak() <= 200) {
                    return 750000;
                } else {
                    return 1000000;
                }
            case "Bisnis":
                if (getJarak() <= 100) {
                    return 1000000;
                } else if (getJarak() <= 200) {
                    return 1250000;
                } else {
                    return 1500000;
                }

            case "VIP":
                if (getJarak() <= 100) {
                    return 1500000;
                } else if (getJarak() <= 200) {
                    return 1750000;
                } else {
                    return 2000000;
                }
        
            default:
                System.out.println("Kelas Layanan Invalid (Valid = Ekonomi, Bisnis, VIP)");
                return -1;
        }
    }
}
