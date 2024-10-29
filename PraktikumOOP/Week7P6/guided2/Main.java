package PraktikumOOP.Week7P6.guided2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Siti", 5000);
        System.out.println("Gaji pegawai (tidak ada bonus) " + employee.hitungGaji());
        System.out.println("Gaji pegawai (plus bonus) " + employee.hitungGaji(10000));

        Manajer manajer = new Manajer("Eksdi", 7500, 500);
        System.out.println("Gaji manajer (tidak ada bonus)" + manajer.hitungGaji());
        System.out.println("Gaji manajer (plus bonus)" + manajer.hitungGaji(3000));
    }
    
}
