package PraktikumOOP.Week9.Projek1;

// @author Fiqki Haidar Amrulloh 20110005

public class Book extends Media implements Reservable{
    private int numberOfPages;

    public Book(String title, String author, int year, int numberOfPages) {
        super(title, author, year);
        this.numberOfPages = numberOfPages;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Number of Pages: " + numberOfPages);
    }

    @Override
    public void reserve() {
        System.out.println("The book \'" + title + "\' has been reserved");
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reservation for the book \'" + title + "\' has been cancelled");
    }
}
