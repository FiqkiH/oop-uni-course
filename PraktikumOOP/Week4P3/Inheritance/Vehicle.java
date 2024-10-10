package PraktikumOOP.Week4P3.Inheritance;

public class Vehicle {
    //instance field
    private String brand;
    private int wheels;

    //constructor
    public Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    //get brand
    public String getBrand() {
        return brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void tampilInfo() {
        System.out.println("Brand: " + brand + "\nWheels: " + wheels);
    }
}
