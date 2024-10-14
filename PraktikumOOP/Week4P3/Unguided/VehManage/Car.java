package PraktikumOOP.Week4P3.Unguided.VehManage;

public class Car extends Vehicle {
    
    public Car(String name, int speed) {
        super(name, speed);
    }

    public void move() {
        System.out.println("Mobil " + getName() + 
        " bergerak dengan kecepatan " + getSpeed() + " km/jam");
    }
    
}
