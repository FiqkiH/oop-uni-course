package TeoriOOP.W4;

public class Instructor {
    private String name;

    public Instructor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void giveAssignment(Student s, String assignment) {
        s.setAssignment(assignment);
    }
}
