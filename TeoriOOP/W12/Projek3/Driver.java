package TeoriOOP.W12.Projek3;

public class Driver {
    public static void main(String[] args) {
    
        TryException t = new TryException();

        try {
            t.setNumber(7, 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(t.getNumber(8));
    }
}
