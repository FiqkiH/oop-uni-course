package PraktikumOOP.Week7P6.guided1;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " Kucing : meow");
    }

    public void purr() {
        System.err.println(name + " mengeong");
    }
}
