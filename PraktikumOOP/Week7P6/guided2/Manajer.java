package PraktikumOOP.Week7P6.guided2;

public class Manajer extends Employee{
    private double tunjangan;

    public Manajer(String name, double salary, double tunjangan) {
        super(name, salary);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return salary + tunjangan;
    }
}
