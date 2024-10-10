package PraktikumOOP.Week4P3.InheritancePolymorphism;

public class Main {
    public static void main(String[] args) {
        Animal hewan = new Animal();
        Dog doggy = new Dog();
        Cat kucheng = new Cat();

        hewan.sound();
        doggy.sound();
        kucheng.sound();
    }
}
