package PraktikumOOP.Week4P3.Inheritance;

public class Bike extends Vehicle{
    private boolean pedals;

    public Bike (String brand, int wheels, boolean pedals) {
        super(brand, wheels);
        this.pedals = pedals;
    }

    public boolean getPedals() {
        return pedals;
    }

    //override method tampilInfo
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Pedal: " + pedals);
    }
}
