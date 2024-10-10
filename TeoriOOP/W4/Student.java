package TeoriOOP.W4;

public class Student {
    private String name;
    private String assignment;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getName() {
        return name;
    }

    public String getAssignment() {
        return assignment;
    }
}
