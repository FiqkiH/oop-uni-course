package PraktikumOOP.Week7P6.guided1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Rio");
        Dog dog = new Dog("Lamal");

        cat.makeSound();
        cat.purr();

        dog.makeSound();
        dog.fetch();
    }
    
}
