package PraktikumOOP.Week4P3.Unguided.VehManage;

public class Truck extends Vehicle {
    
    public Truck(String name, int speed) {
        super(name, speed);
    }

    public void move() {
        System.out.println("Truk " + getName() + 
        " bergerak dengan kecepatan " + getSpeed() + " km/jam");
    }
    
}
