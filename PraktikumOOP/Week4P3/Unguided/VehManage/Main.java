package PraktikumOOP.Week4P3.Unguided.VehManage;

public class Main {
    public static void main(String[] args) {
        Vehicle mobil = new Car("Toyota", 65);
        Vehicle sepeda = new Bike("Polygon", 20);
        Vehicle truk = new Truck("Hino", 42);

        mobil.move();
        sepeda.move();
        truk.move();
    }
    
}
