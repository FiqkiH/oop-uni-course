package PraktikumOOP.Week4P3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4, 4);
        System.out.println("Car's detail: ");
        car.tampilInfo();

        Bike bike = new Bike("Polygon", 2, true);
        System.out.println("Bike's detail: ");
        bike.tampilInfo();
    }
}
