package PraktikumOOP.Week4P3.Unguided.Payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(739000);
        Payment cash = new CashPayment(739000);
        Payment credit = new CreditCardPayment(739000, "8345-5194-9843");

        payment.Pay();
        System.out.println("-------------------------------");
        cash.Pay();
        System.out.println("-------------------------------");
        credit.Pay();
    }
    
}
