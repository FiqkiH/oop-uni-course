package TeoriOOP.W4.Driver2;

public class Car {
    private String name;
    private Engine engine;
    private Transmission transmission;

    public Car(String name) {
        this.name = name;
    }

    public void addEngine(Engine e) {
        engine = e;
    }

    public void addTransmission(Transmission t) {
        transmission = t;
    }
}
