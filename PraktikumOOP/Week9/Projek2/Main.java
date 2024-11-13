package PraktikumOOP.Week9.Projek2;

// @author Fiqki Haidar Amrulloh 20110005 S1SD-03-01

public class Main {
    public static void main(String[] args) {
        System.out.println("\n==============Info Kendaraan==============");

        Motor motor = new Motor("B 1234 AB", "Honda", 15, "Sport", 150);
        System.out.println("\n----------Motor----------");
        motor.tampilInfo();

        Mobil mobil = new Mobil("D 4321 AC", "Toyota", 200, 1000);
        System.out.println("\n----------Mobil----------");
        mobil.tampilInfo();

        Sedan sedanPribadi = new Sedan("A 1234 BC", "Honda Civic", 100, 2000, "Pribadi");
        System.out.println("\n----------Sedan Pribadi----------");
        sedanPribadi.tampilInfo();

        Sedan sedanKomersial = new Sedan("C 4321 BA", "Mercedes", 120, 1500, "Komersial");
        System.out.println("\n----------Sedan Komersial----------");
        sedanKomersial.tampilInfo();
    }
    
}
