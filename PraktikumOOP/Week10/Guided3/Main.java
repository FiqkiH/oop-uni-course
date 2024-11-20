package PraktikumOOP.Week10.Guided3;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 20),
            new Person("Charlie", 25),
            new Person("Daniel", 25)
        );
        
        List<Person> filtered = people.stream()
            .filter(Person -> Person.getAge() > 25)
            .collect(Collectors.toList());
        
        System.out.println("Filter objek berumur > 25");
        filtered.forEach(System.out:: println);

        List<Person> sorted = people.stream()
            .sorted(Comparator.comparing(Person::getAge))
            .collect(Collectors.toList());
        System.out.println("Sorting data by umur ascending ");
        sorted.forEach(System.out::println);
    }
}
