package PraktikumOOP.Week10.Unguided1;

public class Cat extends Animal implements Behaviour{
    private String breed;

    public Cat(String nama, int umur, String breed) {
        super(nama, umur);
        this.breed = breed;
    }

    public void meow() {
        System.out.println(getNama() + " mengeong");
    }

    @Override
    public void describeBehaviour() {
        System.out.println("Kucing suka bermain dan memanjat pohon");
    }
}
