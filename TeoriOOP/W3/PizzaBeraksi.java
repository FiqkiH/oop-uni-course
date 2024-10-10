package TeoriOOP;

public class PizzaBeraksi {

    public static void main(String[] args) {
        Pizza p = new Pizza();
        p.setTopping(2);
        p.setSauce("saus tomat");
        System.out.println("The topping on p is = " + p.getTopping("Alex"));
        System.out.println("The sauce on p is = " + p.getSauce());
        Pizza q = new Pizza();
        q.setTopping(4);
        q.setSauce("saus pedas");
        System.out.println("The topping on q is = " + q.getTopping("Andi"));
        System.out.println("The sauce on q is = " + q.getSauce());
    }
}
