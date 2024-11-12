package PraktikumOOP.Week9.Projek1;

// @author Fiqki Haidar Amrulloh 20110005

public class DVD extends Media implements Reservable{
    private int duration;

    public DVD(String title, String author, int year, int duration) {
        super(title, author, year);
        this.duration = duration;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Number of Pages: " + duration);
    }

    @Override
    public void reserve() {
        System.out.println("The DVD \'" + title + "\' has been reserved");
    }

    @Override
    public void cancelReservation() {
        System.out.println("Reservation for the DVD \'" + title + "\' has been cancelled");
    }
}
