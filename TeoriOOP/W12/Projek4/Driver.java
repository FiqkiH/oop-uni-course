package TeoriOOP.W12.Projek4;

public class Driver {
    public static void main(String[] args) {
        Application w1 = new Application();
        try {
            w1.addUser(new User("001", "Erick"));
            w1.addUser(new User("002", "Danny"));
            w1.addUser(new User("001", "Bob"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }    
}
