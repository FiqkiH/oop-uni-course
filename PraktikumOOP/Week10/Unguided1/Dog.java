package PraktikumOOP.Week10.Unguided1;

public class Dog extends Animal implements Behaviour {
    private String breed;

    public Dog(String nama, int umur, String breed) {
        super(nama, umur);
        this.breed = breed;
        Animal.hitungJumlahHewan();
    }

    public void bark() {
        System.out.println(getNama() + " menggonggong");
    }

    @Override
    public void describeBehaviour() {
        System.out.println("Anjing setia dan suka main bola");
    }

    @Override
    public String toString() {
        return "Dog{Nama: " + getNama() + " Umur: " + getUmur() + " Breed: " + breed +"}";
    }
}
