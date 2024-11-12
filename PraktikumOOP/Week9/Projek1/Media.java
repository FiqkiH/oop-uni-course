package PraktikumOOP.Week9.Projek1;

// @author Fiqki Haidar Amrulloh 20110005

public abstract class Media {
    protected String title;
    protected String author;
    protected int year;

    public Media(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public abstract void displayInfo();

    public void borrow() {
        System.out.println(title + " has been borrowed.");
    }
}
