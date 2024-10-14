package PraktikumOOP.Week4P3.Inheritance;

public class Car extends Vehicle{
    private int doors;
    
    //constructor
    public Car (String brand, int wheels, int doors) {
        super(brand, wheels);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    //override method tampilInfo
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Doors: " + doors);
    }
}
