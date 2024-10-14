package PraktikumOOP.Week4P3.Unguided.Payment;

public class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment (double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public void Pay() {
        super.Pay();
        System.out.println("Pembayaran Kartu Kredit sebesar Rp. " + getAmount() + " menggunakan kartu " + cardNumber);
    }
}
