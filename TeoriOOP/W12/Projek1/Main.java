package TeoriOOP.W12.Projek1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People list[] = new People[4];
        list[0] = new People("Erick");
        list[2] = new People("Adam");
        Scanner s = new Scanner(System.in);
        int id = 0;

        try {
            id = s.nextInt();
            System.out.println(list[id].getName());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Input not a number");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input > array size");
        } catch (NullPointerException e) {
            System.out.println("Array " + id + " has not been instantiated");
        } catch (Exception e) {
            System.out.println("If everything else fails");
        }
    }
}
