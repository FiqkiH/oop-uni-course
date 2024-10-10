package TeoriOOP.W4;

public class Driver {
    public static void main(String[] args) {
        Student s1 = new Student("andi");
        Instructor i1 = new Instructor("budi");
        i1.giveAssignment(s1, "code java OOP");
        System.out.println("Instructor: " + i1.getName());
        System.out.println("Student: " + s1.getName());
        System.out.println(s1.getAssignment());
    }
}
