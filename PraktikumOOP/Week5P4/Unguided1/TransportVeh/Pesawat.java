package PraktikumOOP.Week5P4.Unguided1.TransportVeh;

public class Pesawat extends Transportasi{
    private String maskapai;

    public Pesawat(String nomorKendaraan, int kapasitas, String asalTujuan, double jarak, String kelasLayanan, String maskapai) {
        super(nomorKendaraan, kapasitas, asalTujuan, jarak, kelasLayanan);
        this.maskapai = maskapai;
    }

    public String getMaskapai() {
        return maskapai;
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
                    return 1000000;
                } else if (jarak <= 200) {
                    return 1500000;
                } else {
                    return 2000000;
                }
            case "Bisnis":
                if (jarak <= 100) {
                    return 2000000;
                } else if (jarak <= 200) {
                    return 2500000;
                } else {
                    return 3000000;
                }

            case "VIP":
                if (jarak <= 100) {
                    return 3000000;
                } else if (jarak <= 200) {
                    return 3500000;
                } else {
                    return 4000000;
                }
        
            default:
                System.out.println("Kelas Layanan Invalid (Valid = Ekonomi, Bisnis, VIP)");
                return -1;
        }
    }
}
