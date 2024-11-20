package PraktikumOOP.Week10.Guided1;

// Downcasting

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Polymorphism
        animal.sound();

        Dog dog = (Dog) animal; //Downcasting
        dog.sound();
    }
}
