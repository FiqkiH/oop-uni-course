package PraktikumOOP.Week4P3.Unguided.VehManage;

public class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("Kendaraan " + name + 
        " bergerak dengan kecepatan " + speed + " km/jam");
    }
}
