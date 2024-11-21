package TeoriOOP.W12.Projek2;

public class Driver {
    public static void main(String[] args) {
        TryException t = new TryException();

        try {
            t.setNumber(8, 10);
            System.out.println(t.getNumber(4));
        } catch (Exception e) {
            System.out.println("Exception occurs");
        }
    }
    
}
