package PraktikumOOP.Week5P4.Projek2.Kendaraan;

public abstract class Kendaraan {
    protected String merk;
    protected String model;

    public Kendaraan(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public abstract void bergerak();

    public abstract void tampilkanInfo();
    
}
