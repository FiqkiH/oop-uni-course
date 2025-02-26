package PraktikumOOP.Week5P4.Unguided1.TransportVeh;

public class Kereta extends Transportasi{
    private String jenisKereta;

    public Kereta(String nomorKendaraan, int kapasitas, String asalTujuan, double jarak, String kelasLayanan, String jenisKereta) {
        super(nomorKendaraan, kapasitas, asalTujuan, jarak, kelasLayanan);
        this.jenisKereta = jenisKereta;
    }

    public String getJenisKereta() {
        return jenisKereta;
    }

    @Override
    public double hitungHargaTiket() {
        if (jarak <= 0) {
            System.out.println("Nilai Jarak Invalid");
            return -1;
        }
        //set threshold jarak 100km, 200km, 300km
        switch (kelasLayanan) {
            case "Ekonomi":
                if (jarak <= 100) {
                    return 250000;
                } else if (jarak <= 200) {
                    return 500000;
                } else {
                    return 750000;
                }
            case "Bisnis":
                if (jarak <= 100) {
                    return 750000;
                } else if (jarak <= 200) {
                    return 1000000;
                } else {
                    return 1250000;
                }

            case "VIP":
                if (jarak <= 100) {
                    return 1250000;
                } else if (jarak <= 200) {
                    return 1500000;
                } else {
                    return 1750000;
                }
        
            default:
                System.out.println("Kelas Layanan Invalid (Valid = Ekonomi, Bisnis, VIP)");
                return -1;
        }
    }
}
