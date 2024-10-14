package PraktikumOOP.Week4P3.Unguided;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(739000);
        CashPayment cash = new CashPayment(739000);
        CreditCardPayment credit = new CreditCardPayment(739000, "8345-5194-9843");

        payment.Pay();
        System.out.println("-------------------------------");
        cash.Pay();
        System.out.println("-------------------------------");
        credit.Pay();
    }
    
}
