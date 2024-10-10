package TeoriOOP.W4.Driver2;

public class Driver {
    public static void main(String[] args) {
        Car c = new Car("Honda");

        Engine v1000 = new Engine("v1000");

        Transmission auto = new Transmission();
        auto.setType("Automatic");

        c.addEngine(v1000);
        c.addTransmission(auto);
    }
}
