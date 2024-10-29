package PraktikumOOP.Week7P6.guided1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Anjing : guk guk");
    } 

    public void fetch() {
        System.out.println(name + " menangkap bola");
    }
}
