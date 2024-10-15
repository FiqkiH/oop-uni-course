package PraktikumOOP.Week5P4.Projek2.Kendaraan;

public class Motor extends Kendaraan{
    private boolean memilikiMesinGanda;
    
    public Motor(String merk, String model, boolean memilikiMesinGanda) {
        super(merk, model);
        this.memilikiMesinGanda = memilikiMesinGanda;
    }

    @Override
    public void bergerak() {
        System.out.println("Motor " + merk + " bergerak dengan roda dua");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Motor " + merk + " Model: " + model + " Mesin Ganda: " + memilikiMesinGanda);
    }
    
}
