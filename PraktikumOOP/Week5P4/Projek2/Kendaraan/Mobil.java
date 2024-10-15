package PraktikumOOP.Week5P4.Projek2.Kendaraan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String merk, String model, int jumlahPintu) {
        super(merk, model);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil " + merk + " bergerak dengan roda empat");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil " + merk + " model: " + model + " Jumlah Pintu: " + jumlahPintu);
    }
    
}
