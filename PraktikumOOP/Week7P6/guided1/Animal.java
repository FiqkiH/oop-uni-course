package PraktikumOOP.Week7P6.guided1;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " bersuara");
    }
}
