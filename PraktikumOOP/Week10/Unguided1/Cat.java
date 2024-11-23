package PraktikumOOP.Week10.Unguided1;

public class Cat extends Animal {
    private String breed;

    public Cat(String nama, int umur, String breed) {
        super(nama, umur);
        this.breed = breed;
    }

    public void meow() {
        System.out.println(getNama() + " mengeong");
    }
}
