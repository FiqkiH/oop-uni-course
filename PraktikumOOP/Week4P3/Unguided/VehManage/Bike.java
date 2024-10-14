package PraktikumOOP.Week4P3.Unguided.VehManage;

public class Bike extends Vehicle{
    
    public Bike(String name, int speed) {
        super(name, speed);
    }

    public void move() {
        System.out.println("Sepeda " + getName() + 
        " bergerak dengan kecepatan " + getSpeed() + " km/jam");
    }
    
}
