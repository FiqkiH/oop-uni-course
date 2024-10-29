package PraktikumOOP.Week7P6.guided2;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double hitungGaji() {
        return salary;
    }

    //Overloading
    public double hitungGaji(int bonus) {
        return salary + bonus;
    }
}
