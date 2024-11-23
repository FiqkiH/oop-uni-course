package PraktikumOOP.Week10.Unguided1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animal = Arrays.asList(
            new Dog("Jimmy", 1, "Puddle"),
            new Cat("Jonson", 3, "Persian"),
            new Dog("Sugar", 7, "German Shepperd"),
            new Cat("Daniel", 6, "Munchkin")
        );
        
        int i = 1;
        for (Animal a : animal) {
            System.out.print("### Hewan Ke-" + i++);
            a.tampilInfo();
        }
        
        System.out.println("\nJumlah Hewan: " + animal.get(animal.size() - 1).getJumlahHewan());

        List<Animal> filtered = animal.stream()
            .filter(Animal -> Animal.getUmur() > 5)
            .collect(Collectors.toList());
        
        System.out.println("\nFilter objek berumur > 5");
        filtered.forEach(System.out:: println);

        List<Animal> sorted = animal.stream()
            .sorted(Comparator.comparing(Animal::getUmur))
            .collect(Collectors.toList());
        System.out.println("\nSorting data by umur ascending ");
        sorted.forEach(System.out::println);
    }
}
