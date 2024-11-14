package TeoriOOP.W10.Projek4;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        TryException t = new TryException();
        Scanner s = new Scanner(System.in);
        int number = 0;
        try {
            number = s.nextInt();
        } catch (Exception e) {
            System.out.println("Exception Occurs");
        }

        t.setNumber(number);
    }    
}
