package TeoriOOP.W10.Projek1;

public class Driver {
    public static void main(String[] args) {
        Duck d;
        d = new Duck(4);
        d = new Duck(10);
        d = new Duck(16);
        d = new Duck(5);

        System.out.println(d.getCount());
    }
    
}
